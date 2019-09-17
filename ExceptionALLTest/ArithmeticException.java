
/**
 * Write a description of class ArithmeticException here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

/* {@code ArithmeticExcetion} objects may be constructed by the virtual machine
   as if {@linkplain Throwable#Throwable(String, Throwable, boolean, boolean) supperession
    were disabled and/or the stack trace was not writable}.*/
public class ArithmeticException extends RuntimeException
{
    private static final long serialVersionUID = 7818375828146090155L;
    
    /* Constructs an {@code ArithmeticException} with no detail message.*/
        public ArithmeticException(String s){
            super(s);
        }
}
