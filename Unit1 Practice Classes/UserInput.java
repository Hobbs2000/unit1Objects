//This one is for the first way
import javax.swing.JOptionPane;

//This one is for the second way
import java.util.Scanner;

public class UserInput
{
    public static void main(String[] args) 
    {
        //Brings up message that asks "What is your name?", and then saves the response as name
        String name = JOptionPane.showInputDialog("What is your name?");
        System.out.println(name);
        
        //Second way
        //Creates a new scanner named input that can be used throughout the program
        Scanner input = new Scanner(System.in);
       
        System.out.println("What is your last name?");
        //uses the scanner "input" to find the value of lastName, which is whatever the use typed in
        String lastName = input.nextLine();
        System.out.println("Your name is "+name+" "+lastName);
    }
}