import java.util.*;

public class String2
 { 
    public static void main(String[] args) 
    {
       String animal1 = "quick brown fox"; String animal2 = "lazy dog"; 
       String article = "the"; 
       String action = "jumps over"; 
       String sentence = article.concat(" "+animal1+" "+action+" "+article+" "+animal2);        
       System.out.println(sentence);
       
       
       //using StringTokenizerString
       String sentence2 = "Mary had a little lamb.";
       StringTokenizer mystery = new StringTokenizer(sentence2);
       System.out.println(mystery.countTokens());
       int count = 0;
       for (;count <= 4;) 
       {
          count += 1;
          System.out.println(mystery.nextToken()); 
       }
        
    }
}