
/**
 * Write a description of class ExceptionOverridden here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
// for more to learn goto http://conceptlearningcentre.com/index.php/exception-handling-2/

import java.io.EOFException;
import java.io.IOException;

public class ExceptionOverridden
{
    // Rule 1: superclass method does not declare an exception
    void msg(){
        System.out.println("Parent");
    }
    
    // Rule 2: superclass method declare an exception
    public void someMethod() throws IOException{
        //method body
    }
}

class TestA extends ExceptionOverridden{
    // Rule 1: subclass overridden method cannot declare no exception or the check
    // exception (like IOException) but can delare unchecked exception (like ArithmaticException)
    
    /* valid (no exception)
     * void msg(){
     *     System.out.println("Child");
     * }
     */
    // valid (unchecked exception)
    void msg() throws ArithmeticException{
        System.out.println("Child");
    }
    
    //invalid (checked exception)
    /* void msg() throws IOException{
     *     System.out.println("Child");
     * }*/
     
     //Rule 2: subclass overridden method can declare same. subclass exception 
     //or no exception but cannot declare parent exception
     
     //same-normally valid
    // @override
     public void someMethod() throws EOFException{
         //method body
     }
     
     //valid coz EOFException is a subclass of IOException
     /*@override
     public void someMethod() throws EOFException{
         //method body
     }*/
     
     //not valid coz EOFException is a subclass of IOException
     /*@override
     public void someMethod() throws EOFException{
         //method body
     }*/
}
