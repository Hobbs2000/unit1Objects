import javax.swing.*;
import java.awt.*;
public class TestGameThread extends JPanel implements Runnable
{
    private final TestGame game;
    public TestGameThread(TestGame game)
    {
        this.game = game;
        setFocusable(true);
    }
    
    public void run()
    {
        while (true) 
        {
            try
            {
                if (game.getTestGameScreenFactory().getCurrentScreen() != null)
                {
                    game.getTestGameScreenFactory().getCurrentScreen().onUpdate();
                }
                Thread.sleep(10);
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }
    public void paint(Graphics g)
    {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        if (game.getTestGameScreenFactory().getCurrentScreen() != null)
        {
            game.getTestGameScreenFactory().getCurrentScreen().onDraw(g2d);
        }
        repaint();
    }
}