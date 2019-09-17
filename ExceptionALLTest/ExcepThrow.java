
/**
 * Write a description of class ExcepThrow here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ExcepThrow
{
    static void validate(int age){
    
        if (age <18)
            throw new ArithmeticException("not allowed");
        else
            System.out.println("Welcome to vote");
    }
   
   /* public static void main(String [] abvc){
    
        try{
            validate(23);
        } catch(ArithmeticException e){
            System.out.println(e);
        }
        System.out.println("rest of the code ....");
    }*/
}
