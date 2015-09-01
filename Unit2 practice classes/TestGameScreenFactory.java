public class TestGameScreenFactory
{
    private final TestGame game;
    private TestGameScreen screen;
    
    public TestGameScreenFactory(TestGame game) 
    {
        this.game = game;
    }
    public void showScreen(TestGameScreen screen)
    {
        this.screen = screen;
        this.screen.onCreate();
    }
    
    public TestGameScreen getCurrentScreen()
    {
        return screen;
    }
}