import java.awt.Graphics;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;

public abstract class Figura extends JPanel{
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public abstract void paint(Graphics g) ;

    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub
    }

}
