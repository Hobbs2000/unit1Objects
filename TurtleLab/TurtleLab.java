import java.lang.Object;
import java.awt.*;
public class TurtleLab
{
    public static void main(String[] args)
    {
    World world = new World(1920,1080);
    
    Turtle t1 = new Turtle(world);
    Turtle t2 = new Turtle(world);
    
    t1.setPenColor(Color.RED);
    t2.setPenColor(Color.BLUE);
    
    t1.setPenDown(true);
    boolean isT1Down = true;
    t2.setPenDown(false);
    boolean isT2Down = false;
    int turn = 0;
    int turn2 = 0;
    int times2 = 0;
    for(int go = 0 ;; go++)
    {
        if (go % 2 == 0)
        {
            if (times2 <= 50)
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
                t1.forward(10);
                t1.turn(turn);
                turn ++;
                if (turn > 360)
                {
                    turn -= 360;
                    t1.forward(50);
                }
            }
        
            else
            {
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
                t1.forward(300);
                t1.turn(15);
                t1.backward(300);
            }
        }
        else
        {
            //Odd
            if (times2 <= 50)
            {
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
                t2.forward(10);
                t2.turn(turn2);
                turn2 --;
                if (turn2 < -359)
                {
                    times2 ++;
                    turn2 += 360;
                    t2.forward(50);
                }
            }
            else
            {
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
                t2.forward(300);
                t2.turn(-15);
                t2.backward(300);

            }
            
        }
    }
    }
}
    
