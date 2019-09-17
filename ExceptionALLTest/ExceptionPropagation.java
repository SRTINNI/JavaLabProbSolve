
/**
 * Write a description of class ExceptionPropagation here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ExceptionPropagation
{
   void m(){
   
       int data = 50/0;
   }
   
   void n(){
   
       m();
   }
   
   void p(){
   
       try{
       
           n();
       } catch(Exception e){
       
           System.out.println("Exception Handled.");
       }
   }
   
   /* public static void main(String [] avg){
    * ExceptionPropagation ep = new ExceptionPropagation();
    * ep.p();
    * System.out.println("Normal flow ...");
    }
    */
}

