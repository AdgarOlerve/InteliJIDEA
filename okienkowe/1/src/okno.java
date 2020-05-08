import javax.swing.*;
import java.awt.*;

public class okno
{
    public static void main(String args[])
    {
        okno o = new okno("SZNEJK");
    }
    okno(String nazwa)
    {
        JFrame frame = new JFrame();
        int frameW=500;//szerokosc ramki
        int frameH=500;//wysokosc ramki
        int panelW=20;//szerokosc jednego panelu
        int panelH=20;//wysokosc jednego panelu
        int gap=5;    //przerwa miedzy panelami
        Color zielony = new Color(0,153,0);

        frame.setName(nazwa);
        frame.setSize(frameW,frameH);
        frame.setResizable(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);


        int tabWiersze = (frameW / (panelW + gap));
        int tabKolumny = (frameH / (panelH + gap)-2);
        JPanel[][] panelTab = new JPanel[tabWiersze][tabKolumny];

        int a=0,b=0,i=gap,j=gap;
        for(;(i+panelH)<frameH && a<=tabWiersze-1;i=i+(panelH+gap))
        {
            for(;(j+panelW)<frameW && b<=tabKolumny-1;j=j+(panelW+gap))
            {
                panelTab[a][b] = new JPanel();
                panelTab[a][b].setBounds(i,j,panelW,panelH);
                panelTab[a][b].setOpaque(true);
                panelTab[a][b].setBackground(zielony);
                frame.add(panelTab[a][b]);
                b++;
            }
            j=gap;
            a++;
            b=0;
        }
        frame.setVisible(true);
    }
}

