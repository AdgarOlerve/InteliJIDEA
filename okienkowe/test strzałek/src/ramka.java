import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class ramka implements KeyListener
{
    static public void main(String argsp[])
    {
        ramka x = new ramka();
    }
    ramka()
    {
        JFrame frame = new JFrame();
        frame.addKeyListener(this);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setVisible(true);

    }

    @Override
    public void keyTyped(KeyEvent event)
    {}
    public void keyReleased(KeyEvent event)
    {}
    public void keyPressed(KeyEvent event)
    {
        char c = event.getKeyChar();
        if(c==119)
        {
            System.out.println("Gora");
        }
        else if(c==115)
        {
            System.out.println("dol");
        }
        else if(c==97)
        {
            System.out.println("lewo");
        }
        else if(c==100)
        {
            System.out.println("prawo");
        }
    }

}
