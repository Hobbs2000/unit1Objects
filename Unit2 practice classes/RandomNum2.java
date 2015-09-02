import java.util.*;
public class RandomNum2
{
    public static int getRandNum(int range)
    {
        Random numGen = new Random();
        int num = numGen.nextInt(range+1);
        return num;
    }
}