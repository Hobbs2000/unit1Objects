public class RunTestGame
{
    private TestGame game;
    
    public RunTestGame() 
    {
        game = new TestGame(400, 300);
    }
    public static void main(String[] args)
    {
        new RunTestGame();
    }
}