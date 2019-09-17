
/**
 * Write a description of class TestStringVsStringBuffer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.lang.*;

public class TestStringVsStringBuffer
{
    public static String concatWithString(){
    
        String t = "Cat";
        for(int i = 0; i<10000; i++)
            t = t.concat("Dog");
        return t;
    }
    
    public static String concatWithStringBuffer(){
    
        StringBuffer sb = new StringBuffer ("Cat");
        for(int i = 0; i<10000; i++)
            sb.append("Dog");
        return sb.toString();
    }
    
    public static String concatWithStringBuilder(){
    
        StringBuilder sb = new StringBuilder("Cat");
        for(int i = 0; i<10000; i++)
            sb.append("Dog");
        return sb.toString();
    }
    
    public static void main(String [] avc){
        String s = "Washiqul Islam";
        String s1 = new String("Dhaka Bangladesh");
    
        String s3 = "New"; 
        s = s3;
        //s = s3.replace();
        System.out.println(s);
        System.out.println(s1);
        System.out.println(s3);
        
        StringBuffer s4 = new StringBuffer("Washiqul Islam");
        StringBuffer s5; 
        s5 = s4;
        
        
        System.out.println(s4);
        System.out.println(s5);
        
        s4.reverse();
        System.out.println(s4);
       /*long start = System.currentTimeMillis();
           concatWithString();
           System.out.println("Concat with String took: " + (System.currentTimeMillis() - start) + "ms");
           start = System.currentTimeMillis();
           concatWithStringBuffer();
           System.out.println("Concat with StringBuffer took: " + (System.currentTimeMillis() - start) + "ms");
           start = System.currentTimeMillis();
           concatWithStringBuilder();
           System.out.println("Concat with StringBuilder took: " + (System.currentTimeMillis() - start) + "ms");
       */
    }
}
