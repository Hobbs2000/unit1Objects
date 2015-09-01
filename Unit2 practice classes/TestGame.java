import javax.swing.*;
import java.util.*;

public class TestGame
{
    
    private final JFrame window = new JFrame();
    private final TestGameScreenFactory screenFactory;
    
    public TestGame(int windowX, int windowY)
    {
        window.setSize(windowX, windowY);
        window.setResizable(false);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setFocusable(true);
        window.setLocationRelativeTo(null);
        window.setTitle("Test");
        window.setVisible(true);
        screenFactory = new TestGameScreenFactory(this);
    }
    
    public TestGameScreenFactory getTestGameScreenFactory()
    {
        return screenFactory;
    }
    
    public JFrame getWindow()
    {
        return window;
    }
}