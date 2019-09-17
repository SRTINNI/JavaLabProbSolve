
/**
 * Write a description of class ForEachLoop here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ForEachLoop
{
    public static void main(String[] aa)
    {
       int [] a={3,4,5,-5,0,12};
       
       int r=ForEachCal.sum(a);
       System.out.println("Sum of the numbers are: "+r);
    
    }
}
class ForEachCal
{
    static int sum(int [] a){
      int result=0;
      for(int i:a)
      {
           result=result+i;
      }
        
       return result;
    }
}

