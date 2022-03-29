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

        int x_1 = 400;
        int y_1 = 400;
        g2d.setPaint(Color.BLACK);
        int[] xPointsH = {x_1+40, x_1+60, x_1+60, x_1+70, x_1+70, x_1+80, x_1+70, x_1+70, x_1+10, x_1+10, x_1, x_1+40};
        int[] yPointsH = {y_1, y_1+20, y_1+10, y_1+10, y_1+30, y_1+40, y_1+40, y_1+80, y_1+80, y_1+40, y_1+40, y_1};
        g2d.drawPolygon(xPointsH, yPointsH, 12);
    
        g2d.setPaint(Color.LIGHT_GRAY);
        int[] xPoints = {x, x+20, x+50, x+110, x+120, x+120, x+70, x+100, x+120, x+130, x+110, x+110, x+100, x+90, x+80, x+70, x+80, x+50, x+10, x, x, x+30, x, x};
        int[] yPoints = {y, y, y+30, y, y, y+10, y+50, y+80, y+70, y+80, y+90, y+100, y+110, y+110, y+130, y+120, y+100, y+70, y+120, y+120, y+110, y+50, y+20, y};
        // g2d.drawPolygon(xPoints, yPoints, 23);
        g2d.fillPolygon(xPoints, yPoints, 23);


        g2d.setPaint(Color.CYAN);
        int x_2 = 200;
        int y_2 = 200;
		g2d.fillOval(x_2, y_2+50, 60, 50);
		g2d.fillOval(x_2+35, y_2, 50, 75);
		g2d.fillOval(x_2+40, y_2+50, 100, 40);
		g2d.fillOval(x_2+55, y_2+5, 105, 55);
    }
        
}