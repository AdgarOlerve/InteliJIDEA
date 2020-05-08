import javax.swing.*;
import java.awt.*;

public class okno extends JPanel
{
    int x=10,y=10,h=100,w=100;
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.setColor(Color.red);
        g.fillRect(x,y,h,w);
    }
    public okno(String nazwa)
    {
        JFrame ramka=new JFrame(nazwa);
        ramka.setSize(500,500);
        ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ramka.setVisible(true);
        ramka.add(this);
    }
    public static void main(String args[])
    {
        okno o = new okno("test");


    }
}
