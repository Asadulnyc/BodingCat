import javax.swing.*;
import java.awt.*;

public class DrawingExample extends JFrame {

    public DrawingExample() {
        setTitle("Drawing Example");
        setSize(400,   3300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(new DrawingPanel());
        setVisible(true);
    }

    class DrawingPanel extends JPanel {
        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(Color.BLUE);
            g.fillRect(50, 50, 100, 80);
            g.setColor(Color.RED);
            g.drawString("Hello, Java Graphics!", 100, 200);
        }
    }
}