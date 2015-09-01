import java.awt.*;
import javax.swing.*;
public class BrighterDemo
{
    public static void main(String[] args) 
    {
        Color c1 = new Color(0,0,255);
        Color c2 = new Color(255,0,0);
        Color c3 = new Color(0,255,0);
        
        JFrame frame = new JFrame();
        frame.setSize(300, 300);
        frame.getContentPane().setBackground(c1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        int go = 0;
        
        for (;go > -1;)
        {
            go += 1;
            frame.getContentPane().setBackground(c1);
            frame.getContentPane().setBackground(c2);
            frame.getContentPane().setBackground(c3);
            if ( go % 2 == 0)
            {
                //Means its even
                frame.setSize(300,300);
            }
            else
            {
                //Means its even
                frame.setSize(200,200);
            }
        }
    }
}