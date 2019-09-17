
/**
 * Write a description of class ArrayFind here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArrayFind
{
    public static void main(String[]a)
    {
        int [] b ={10,30,100,150};
        int temp;
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4-i-1;j++)
            {
                if(b[j] < b[j+1])
                {
                    temp=b[j];
                    b[j]=b[j+1];
                    b[j+1]=temp;
                }
            }
        }
        System.out.println("Second largset element is:"+b[1]);
        
    }
}

