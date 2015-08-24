import java.awt.Color;

public class TurtleWorld
{
    public static void main(String args[])
    {
        int go = 0;
        int turn = 0;
        World turtleWorld = new World();
        Turtle turtle = new Turtle(turtleWorld);
        turtle.setPenColor(Color.RED);
        turtle.penDown();
        turtle.forward(50);
        for (;go > -1;){
            go += 1;
            turn += 1;
            turtle.forward(go);
            turtle.turn(turn);

            
        }
    }
}
