
/**
 * Write a description of class FieldInitializeExample here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Date;
public class FieldInitializeExample
{
    //Field variable declaration
    double d;               //Initialize using default value
    Date date=new Date();   //Initialize using exlicit value
    String s;               //Initialize using constructor
   
    public FieldInitializeExample(String s)
    {
        this.s=s;
    }
    
    public static void main(String[] Ex)
    {
        FieldInitializeExample obj = new FieldInitializeExample("Hello");
        
        System.out.println(obj.d);
        System.out.println(obj.date);
        System.out.println(obj.s);
    }
    
}
