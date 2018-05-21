import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;

public class Kolo extends JComponent  {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    public int x = 50;
    public int y = 50;
    public int r = 100;
    public static Color c= new Color(100,0,200);
    public static Color f = new Color(250,0,0);
    public Color currentColor = f;

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(currentColor);
        g.drawOval(x, y, r, r);
        g.fillOval(x, y, r, r);
    }

    public void moveRight() {
        x = x + r;
        repaint();
    }

    public void moveLeft() {
        x = x - r;
        repaint();
    }

    public void moveDown() {
        y = y + r;
        repaint();
    }

    public void moveUp() {
        y = y - r;
        repaint();
    }

    public void pressEnter() {
        r = 0;
        repaint();
    }

    public void clicked() {
        currentColor = c;
        repaint();
    }
}
