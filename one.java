import java.awt.*;
import javax.swing.*;

public class one {
    public static void main(String[] args) {
        JFrame win = new JFrame("Grapgics");
        win.setSize(400, 400);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.setLayout(new BorderLayout(1, 1));
        Canvas canv = new Canvas();
        win.add(canv);
        win.setVisible(true);
        
    }
}

class Canvas extends JComponent {
    public void paintComponent(Graphics g) {
        super.paintComponents(g);
        Graphics2D g2d = (Graphics2D)g;
        g2d.setPaint(Color.RED);
        int x1_9 = 200, y1_9 = 100;
		int x2_9 = 200, y2_9 = 300;
		int i_9 = 0;
		do {
			g2d.drawLine(x1_9, y1_9, x2_9, y2_9);
			y2_9 = y2_9 - 8;
			x1_9 = x1_9 - 8;
			y1_9 = y1_9 + 8;
			i_9++;
		} while (i_9 < 15);
    }
}