import java.util.*;
class CallRandomNum2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        for (;;)
        {         
            System.out.print( "What is the range of the random number you would like?: " );
            int range = input.nextInt();
            System.out.println("Your number is "+RandomNum2.getRandNum(range));
        }
    }
}