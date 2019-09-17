
/**
 * Write a description of class EOFException here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

/* This exception is mainly used by data input streams to signal end of stream. Note
   taht many other input operations return a special value on end of stream than
   throwing an exception.*/
public class EOFException extends IOException
{
    static final long serialVersionUID = 7818375828146090155L;
    
    /* Constructs an <code> EOFException with </code> with  <code>null</code> as 
     * its error detail message.*/
        public EOFException(){
            super();
        }
}
