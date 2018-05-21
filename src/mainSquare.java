import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;

public class mainSquare extends JComponent {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    int[] point_x = {0,150,150,0};
    int[] point_y = {0,0,150,150};
    public static Color c= new Color(100,150,200);
    public static Color f = new Color(250,0,0);
    public Color currentColor = f;

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(currentColor);
        g.fillPolygon(point_x, point_y,4);
    }

    public void moveRight() {
        point_x[1] = point_x[1] + 5;
        point_x[2] = point_x[2] + 5;
        point_x[3] = point_x[3] + 5;
        point_x[4] = point_x[4] + 5;
        repaint();
    }

    public void moveLeft() {
        point_x[1] = point_x[1] - 5;
        point_x[2] = point_x[2] - 5;
        point_x[3] = point_x[3] - 5;
        point_x[4] = point_x[4] - 5;
        repaint();
    }

    public void moveDown() {
        point_y[1] = point_y[1] + 5;
        point_y[2] = point_y[2] + 5;
        point_y[3] = point_y[3] + 5;
        point_y[4] = point_y[4] + 5;
        repaint();
    }

    public void moveUp() {
        point_y[1] = point_y[1] - 5;
        point_y[2] = point_y[2] - 5;
        point_y[3] = point_y[3] - 5;
        point_y[4] = point_y[4] - 5;
        repaint();
    }

    public void pressEnter() {
        point_y[1] = 0;
        point_y[2] = 0;
        point_y[3] = 0;
        point_y[4] = 0;
        point_x[1] = 0;
        point_x[2] = 0;
        point_x[3] = 0;
        point_x[4] = 0;
        repaint();
    }

    public void clicked() {
        currentColor = c;
        repaint();
    }
}

