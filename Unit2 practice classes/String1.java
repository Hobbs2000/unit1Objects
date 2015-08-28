public class String1
{
    public static void main(String[] args)
    {
        String greeting = "Hello World!";
        System.out.println(greeting);
        int n = greeting.length();
        
        System.out.println("Length of the greeting: "+n);
        
        String river = "Mississippi";
        String bigRiver = river.toUpperCase();
        System.out.println("River: "+river+" Big river: "+bigRiver);
        
    }
}