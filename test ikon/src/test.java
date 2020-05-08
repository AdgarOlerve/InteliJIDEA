import javax.swing.*;

public class test
{
    public static void main(String args[]) throws InterruptedException {
      JFrame frame = new JFrame();
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(500,500);

      ImageIcon icon = new ImageIcon("C:\\Users\\Admin\\Desktop\\pixil-frame-0.png");
      JLabel label = new JLabel(icon);
      frame.add(label);
      frame.setLayout(null);
      frame.setVisible(true);
      int x=1;
      int y=1;
      while(true)
      {
          label.setBounds(x,y,icon.getIconWidth(),icon.getIconHeight());
          x+=1;
          y+=1;
          frame.repaint();
          Thread.sleep(100);
      }
    }
}
