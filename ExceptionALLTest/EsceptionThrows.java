
/**
 * Write a description of class EsceptionThrows here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

 

public class EsceptionThrows
{
    static void validate (int age) throws InvalidAgeException{
    
        if (age<18)
            throw new InvalidAgeException("not valid");
        else
            System.out.println("Welcome to vote");
    }
    
   /*public static void main(String [] ab){
    
        try{
        
            validate(13);
        } catch(InvalidAgeException e){
        
            System.out.println(e);
        }
        System.out.println("rest of the code ....");
    }*/
}
