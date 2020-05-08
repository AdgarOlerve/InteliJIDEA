import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

public class test
{
    public static void main(String[] args)
    {

        BufferedImage img=null;
        try
        {
            img = ImageIO.read(new File("C:\\Users\\Admin\\Desktop\\pixil-frame-0 (1).png"));
        }catch(Exception e)
        {
            //ignore
        }
        int[][] pixels = new int[img.getWidth()][img.getHeight()];
        for(int i=0;i<img.getWidth();i++)
        {
            for(int j=0;j<img.getHeight();j++)
            {
                pixels[i][j]=img.getRGB(i,j);
            }
        }
        for(int i=0;i<img.getWidth();i++)
        {
            for(int j=0;j<img.getHeight();j++)
            {
                System.out.println(pixels[i][j]);
            }
        }
    }
}
