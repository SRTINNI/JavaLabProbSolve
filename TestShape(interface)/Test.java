
/**
 * Write a description of class Shape here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

interface Shape
{
  double dim1=10.0 ;
  double dim2=20.0 ;
  void area(double dim1,double dim2);
   //public abstract void circumference();
}
class Rect implements Shape
{
  
    //@override
   public void area(double dim1,double dim2)
    {
        System.out.println("Rect area:" +(dim1*dim2));  
    }
}
class Triangle implements Shape
{
    //@override
   public void area(double dim1,double dim2)
    {
        System.out.println("Triangle area:" +(0.5*dim1*dim2));  
    }
}
class Circle implements Shape
{
   //@override
   public void area(double dim1,double dim2)
    {
        System.out.println("Circle area:" +(3.1416*dim1*dim1));  
    }
}
public class Test
{
    public static void main(String[] abc)
    {
       Shape sp;
       Rect r=new Rect();
        sp=r;
        sp.area(10.0,20.0);
        
       Triangle t=new Triangle();
        sp=t;
        sp.area(10.0,20.0);
        
       Circle c=new Circle();
        sp=c;
        sp.area(10.0,10.0);
    }
}


