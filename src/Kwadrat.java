import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;

public class Kwadrat extends JComponent  {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    public int x = 100;
    public int y = 100;
    public int szerokosc = 100;
    public int wysokosc = 100;
    public static Color c= new Color(0,150,0);
    public static Color f = new Color(250,0,0);
    public Color currentColor = f;

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(currentColor);
        g.drawRect(x, y, szerokosc, wysokosc);
        g.fillRect(x, y, szerokosc, wysokosc);
    }

    public void moveRight() {
        x = x + 20;
        repaint();
    }

    public void moveLeft() {
        x = x - 20;
        repaint();
    }

    public void moveDown() {
        y = y + 20;
        repaint();
    }

    public void moveUp() {
        y = y - 20;
        repaint();
    }

    public void pressEnter() {
        szerokosc = 0;
        wysokosc = 0;
        repaint();
    }

    public void clicked() {
        currentColor = c;
        repaint();
    }
}
