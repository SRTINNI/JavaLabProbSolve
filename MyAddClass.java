
/**
 * Write a description of class MyAddClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyAddClass
{
    private int a=10;
    private int b=20;
    private int sum=0;
    
    public void addData()
    {
        sum= a+b;
    }
    
    public static void main(String[] args)
    {
        MyAddClass obj =new MyAddClass();
        obj.addData();
        System.out.println("Add= " +obj.sum);
    
    }
}
