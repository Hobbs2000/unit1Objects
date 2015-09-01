import java.awt.*;
public abstract class TestGameScreen
{
    private final TestGameScreenFactory screenFactory;
    
    public TestGameScreen(TestGameScreenFactory screenFactory)
    {
        this.screenFactory = screenFactory;
    }
    public abstract void onCreate();
    public abstract void onUpdate();
    public abstract void onDraw(Graphics2D g2d);
    
    public TestGameScreenFactory getTestGameScreenFactory() 
    {
        return screenFactory;
    }
}