import javax.swing.*;
import java.awt.*;

class Main extends JFrame
{
    private final int paneleWiersze=20;
    private final int paneleKolumny=20;
    private final int panelWidth=20;
    private final int panelHeight=20;
    private final int gap=5;
    private final JPanel[][] panele = new JPanel[paneleWiersze][paneleKolumny];
    private final JFrame ramka = new JFrame();
    public void main(String[] args)
    {
        ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ramka.setSize(500,500);
        ramka.setResizable(false);
        ramka.setVisible(true);
        panelInicializer();
    }
    public void panelInicializer()
    {
        int panelX=0;
        int panelY=0;
        for(int i=0;i<=paneleWiersze-1;i++)
        {
            for(int j=0;j<=paneleKolumny-1;j++)
            {
                panele[i][j]=new JPanel();
                panele[i][j].setBackground(Color.blue);
                panele[i][j].setBounds(panelX+gap,panelY+gap,panelWidth,panelHeight);
                panelX=panelX+panelWidth;
                ramka.add(panele[i][j]);
            }
            panelY=panelY+panelHeight;
        }
    }
}
