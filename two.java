import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class two {
    public static void main(String[] args) {
        JFrame win = new JFrame("Grapgics");
        win.setSize(1000, 1000);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.setLayout(new BorderLayout(1, 1));
        Canvas canv = new Canvas();
        win.add(canv);
        win.setVisible(true);
        
    }
}

class Canvas extends JComponent implements ActionListener{
    public Canvas() {
        super();
        Timer timer = new Timer(5, this);
        timer.start();
        
    }
    
    int x = 1000, y = 1000;

    @Override
    public void actionPerformed(ActionEvent e) {
        x-=1;
        y-=1;
        repaint();
    }

    public void paintComponent(Graphics g) {
        super.paintComponents(g);
        Graphics2D g2d = (Graphics2D)g;

        Color house = new Color(64, 28, 10);
        Color sky = new Color(85, 170, 255);

        //Земля
        g2d.setPaint(Color.GREEN);
        g2d.fillRect(0, 500, 1000, 1000);
        //Небо
        g2d.setPaint(sky);
        g2d.fillRect(0, 0, 1000, 500);
        //Солнце
        g2d.setPaint(Color.YELLOW);
        g2d.fillOval(750, 100, 100, 100);


        
        //Дом
        g2d.setPaint(house);
        int x_1 = 400;
        int y_1 = 400;
        int[] xPointsH = {x_1+80, x_1+120, x_1+120, x_1+140, x_1+140, x_1+160, x_1+140, x_1+140, x_1+20, x_1+20, x_1, x_1+80};
        int[] yPointsH = {y_1, y_1+40, y_1+20, y_1+20, y_1+60, y_1+80, y_1+80, y_1+160, y_1+160, y_1+80, y_1+80, y_1};
        g2d.fillPolygon(xPointsH, yPointsH, 12);
        //Окно
        g2d.setPaint(Color.WHITE);
        int[] xPointsWH = {x_1+60, x_1+100, x_1+100, x_1+60};
        int[] yPointsWH = {y_1+80, y_1+80, y_1+120, y_1+120};
        g2d.fillPolygon(xPointsWH, yPointsWH, 4);
        g2d.setPaint(house);
        int[] xPointsW = {x_1+60, x_1+100, x_1+100, x_1+60, x_1+60, x_1+80, x_1+80, x_1+100, x_1+100, x_1+60, x_1+60};
        int[] yPointsW = {y_1+80, y_1+80, y_1+120, y_1+120, y_1+80, y_1+80, y_1+120, y_1+120, y_1+100, y_1+100, y_1+80};
        g2d.drawPolygon(xPointsW, yPointsW, 11);


        //Самолет
        g2d.setPaint(Color.LIGHT_GRAY);
        int[] xPoints = {x, x+20, x+50, x+110, x+120, x+120, x+70, x+100, x+120, x+130, x+110, x+110, x+100, x+90, x+80, x+70, x+80, x+50, x+10, x, x, x+30, x, x};
        int[] yPoints = {y, y, y+30, y, y, y+10, y+50, y+80, y+70, y+80, y+90, y+100, y+110, y+110, y+130, y+120, y+100, y+70, y+120, y+120, y+110, y+50, y+20, y};
        // g2d.drawPolygon(xPoints, yPoints, 23);
        g2d.fillPolygon(xPoints, yPoints, 23);

        //Облако
        g2d.setPaint(Color.WHITE);
        int x_2 = 50;
        int y_2 = 200;
        int[] mass = {0, 50, -30, 60};
        for (int i = 0; i < 4; i++) {
            g2d.fillOval(x_2, y_2+50, 60, 50);
            g2d.fillOval(x_2+35, y_2, 50, 75);
            g2d.fillOval(x_2+40, y_2+50, 100, 40);
            g2d.fillOval(x_2+55, y_2+5, 105, 55);
            g2d.fillOval(x_2-20, y_2+10, 100, 50);
            x_2 += 250;
            y_2 += mass[i];
        }
        
        

    }
        
}