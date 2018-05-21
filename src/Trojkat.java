import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;

public class Trojkat extends JComponent  {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    int[] x = {0,300,150};
    int[] y = {200,200,0};
    public static Color c= new Color(0,50,200);
    public static Color f = new Color(250,150,0);
    public Color currentColor = f;

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(currentColor);
        g.fillPolygon(x, y,3);
    }

    public void moveRight() {
        x[0] = x[0] + 20;
        x[1] = x[1] + 20;
        x[2] = x[2] + 20;
        repaint();
    }

    public void moveLeft() {
        x[0] = x[0] - 20;
        x[1] = x[1] - 20;
        x[2] = x[2] - 20;
        repaint();
    }

    public void moveDown() {
        y[0] = y[0] + 20;
        y[1] = y[1] + 20;
        y[2] = y[2] + 20;
        repaint();
    }

    public void moveUp() {
        y[0] = y[0] - 20;
        y[1] = y[1] - 20;
        y[2] = y[2] - 20;
        repaint();
    }

    public void pressEnter() {
        y[0] = 0;
        y[1] = 0;
        y[2] = 0;
        x[0] = 0;
        x[1] = 0;
        x[2] = 0;
        repaint();
    }

    public void clicked() {
        currentColor = c;
        repaint();
    }
}
