import javax.swing.*;
import java.util.*;
import java.awt.event.*;

public class TestGame
{
    
    private final JFrame window = new JFrame();
    private final TestGameScreenFactory screenFactory;
    private final TestGameThread gameThread;
    private final TestGameKeysListener keyboardListener;
    private final TestGameMouseListener mouseListener;
    
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
        gameThread = new TestGameThread(this);
        keyboardListener = new TestGameKeysListener();
        mouseListener = new TestGameMouseListener();
        
        window.addKeyListener(keyboardListener);
        window.add(gameThread);
        
        window.addMouseListener(mouseListener);
        
        new Thread(gameThread).start();
    }
    
    public TestGameMouseListener getMouseListener()
    {
        return mouseListener;
    }
    
    public TestGameKeysListener getKeyboardListener()
    {
        return keyboardListener;
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