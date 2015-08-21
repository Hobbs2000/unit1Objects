import java.awt.Color;

public class TurtleWorld
{
    public static void main(String args[])
    {
        int go = 10;
        World turtleWorld = new World();
        Turtle turtle = new Turtle(turtleWorld);
        turtle.setPenColor(Color.RED);
        turtle.penDown();
        turtle.forward(50);
        for (;go > 0;){
            go += 1;
            turtle.turn(90);
            turtle.setPenColor(Color.RED);
            turtle.forward(go);
            turtle.turn(90);
            turtle.setPenColor(Color.BLUE);
            go += 1;
            turtle.forward(go);
            turtle.turn(90);
            turtle.setPenColor(Color.GREEN);
            go += 1;
            turtle.forward(go);
            
        }
    }
}
