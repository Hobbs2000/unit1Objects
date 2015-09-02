import java.util.*;
public class RandomNum
{
    public static void main(String[] args)
    {
        //Option A
        Random numGen = new Random();
        int dieVal = numGen.nextInt(7);
        
        System.out.println(dieVal);
        
        //Option B
        double dieVal2 = Math.random();
        dieVal2 *= 6;
        dieVal2 += 1;
        
        System.out.println( (int) dieVal2 );
    }
}