// import java.awt.*;
// import javax.swing.*;

// public class one {
//     public static void main(String[] args) {
//         JFrame win = new JFrame("Grapgics");
//         win.setSize(400, 400);
//         win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         win.setLayout(new BorderLayout(1, 1));
//         Canvas canv = new Canvas();
//         win.add(canv);
//         win.setVisible(true);
        
//     }
// }

// class Canvas extends JComponent {
//     public void paintComponent(Graphics g) {
//         super.paintComponents(g);
//         Graphics2D g2d = (Graphics2D)g;
//         g2d.setPaint(Color.RED);
//         int x1 = 200, y1 = 100;
// 		int x2 = 200, y2 = 300;
// 		int i = 0;
// 		do {
// 			g2d.drawLine(x1, y1, x2, y2);
// 			y2 -= 10;
// 		    x1 -= 10;
// 			y1 += 10;
// 			i++;
// 		} while (i < 13);
//     }
// }