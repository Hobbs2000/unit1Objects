import java.awt.*;
import javax.swing.*;
public class BrighterDemo
{
    public static void main(String[] args) 
    {
        Color c1 = new Color(50,100,150);
        
        JFrame frame = new JFrame();
        frame.setSize(1920, 1080);
        frame.getContentPane().setBackground(c1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}