import java.lang.Object;
import java.awt.*;
public class TurtleLab
{
    public static void main(String[] args)
    {
    World world = new World();
    
    Turtle t1 = new Turtle(world);
    Turtle t2 = new Turtle(world);
    
    t1.setPenColor(Color.RED);
    t2.setPenColor(Color.BLUE);
    
    t1.setPenDown(true);
    boolean isT1Down = true;
    t2.setPenDown(false);
    boolean isT2Down = false;
    
    for(int go = 0 ;; go++)
    {
        if (go % 2 == 0)
        {
            //Even
            if (isT1Down == true)
            {
                t1.setPenDown(false);
                isT1Down = false;
            }
            else 
            {
                t1.setPenDown(true);
                isT1Down = true;
            }
            t1.forward(50);
            t1.turn(15);
        }
        else
        {
            //Odd
            if (isT2Down == true)
            {
                t2.setPenDown(false);
                isT2Down = false;
            }
            else
            {
                t2.setPenDown(true);
                isT2Down = true;
            }
            t2.forward(50);
            t2.turn(15);
            
        }
    }
    }
}
    
