import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;


public class main extends JFrame implements KeyListener, MouseListener, MouseMotionListener{
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    //private Kwadrat kwadrat;
    private Trojkat trojkat;
    //private Kolo kolo;
    //private mainSquare square;

    public void keyPressed(KeyEvent e) {
        System.out.println("keyPressed");
    }
/*
    public void keyReleased(KeyEvent e) {
        if(e.getKeyCode()== KeyEvent.VK_RIGHT)
            kwadrat.moveRight();
        else if(e.getKeyCode()== KeyEvent.VK_LEFT)
            kwadrat.moveLeft();
        else if(e.getKeyCode()== KeyEvent.VK_DOWN)
            kwadrat.moveDown();
        else if(e.getKeyCode()== KeyEvent.VK_UP)
            kwadrat.moveUp();
        else if(e.getKeyCode()==KeyEvent.VK_ENTER)
        		kwadrat.pressEnter();

    }
*/

    public void keyReleased(KeyEvent e) {
        if(e.getKeyCode()== KeyEvent.VK_RIGHT)
            trojkat.moveRight();
        else if(e.getKeyCode()== KeyEvent.VK_LEFT)
            trojkat.moveLeft();
        else if(e.getKeyCode()== KeyEvent.VK_DOWN)
            trojkat.moveDown();
        else if(e.getKeyCode()== KeyEvent.VK_UP)
            trojkat.moveUp();
        else if(e.getKeyCode()==KeyEvent.VK_ENTER)
        		trojkat.pressEnter();

    }

/*
    public void keyReleased(KeyEvent e) {
        if(e.getKeyCode()== KeyEvent.VK_RIGHT)
            square.moveRight();
        else if(e.getKeyCode()== KeyEvent.VK_LEFT)
            square.moveLeft();
        else if(e.getKeyCode()== KeyEvent.VK_DOWN)
            square.moveDown();
        else if(e.getKeyCode()== KeyEvent.VK_UP)
            square.moveUp();
        else if(e.getKeyCode()==KeyEvent.VK_ENTER) {
            square.pressEnter();
        }

    }
*//*
    public void keyReleased(KeyEvent e) {
        if(e.getKeyCode()== KeyEvent.VK_RIGHT)
            kolo.moveRight();
        else if(e.getKeyCode()== KeyEvent.VK_LEFT)
            kolo.moveLeft();
        else if(e.getKeyCode()== KeyEvent.VK_DOWN)
            kolo.moveDown();
        else if(e.getKeyCode()== KeyEvent.VK_UP)
            kolo.moveUp();
        else if(e.getKeyCode()==KeyEvent.VK_ENTER)
            kolo.pressEnter();

    }
*/
    public void keyTyped(KeyEvent e) {
        System.out.println("keyTyped");
    }

    public main(){
        //this.kwadrat=new Kwadrat();
        this.trojkat = new Trojkat();
        //this.kolo = new Kolo();
        //this.square = new mainSquare();
        addKeyListener(this);
        addMouseListener(this);
        addMouseMotionListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                main frame = new main();
                frame.setTitle("Square Move Practice");
                frame.setResizable(false);
                frame.setSize(600, 600);
                frame.setMinimumSize(new Dimension(600, 600));
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                //frame.getContentPane().add(frame.kwadrat);
                frame.getContentPane().add(frame.trojkat);
                //frame.getContentPane().add(frame.kolo);
                //frame.getContentPane().add(frame.square);
                frame.pack();
                frame.setVisible(true);
            }
        });
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub
        System.out.println("MouseClicked");
        //kwadrat.clicked();
        trojkat.clicked();
        //kolo.clicked();
        //square.clicked();
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub

    }
}
