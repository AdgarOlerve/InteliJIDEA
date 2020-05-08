import javax.swing.*;
import java.awt.*;

public class Painter
{
    public Painter()
    {
        final Color red = new Color(208,12,13);
        final Color blue = new Color(234);
        GridBagConstraints gbc = new GridBagConstraints();
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1050,1050);
        frame.setLayout(new GridBagLayout());
        int x=64;
        int y=64;
        JPanel[][] pnl = new JPanel[x][y];
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.NORTHWEST;
        gbc.insets = new Insets(1,1,1,1);
        gbc.weighty=0.1;
        gbc.weightx=0.1;
        for(int i=0;i<x;i++)
            {
            for (int j = 0; j < y; j++)
                {
                gbc.gridx=i;
                gbc.gridy=j;
                pnl[i][j] = new JPanel();
                pnl[i][j].setBackground(blue);
                pnl[i][j].setPreferredSize(new Dimension(50, 50));
                gbc.fill = GridBagConstraints.BOTH;
                frame.add(pnl[i][j], gbc);
                }
            }
        frame.setVisible(true);


    }
    public static void main(String[] args)
    {
        Painter painter = new Painter();
    }
}
