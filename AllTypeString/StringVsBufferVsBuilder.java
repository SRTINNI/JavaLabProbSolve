
/**
 * Write a description of class StringVsBufferVsBuilder here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StringVsBufferVsBuilder
{
    public static void main(String [] abb){
    
        String s1 = "New";
        s1 = s1.concat(" Documents");
        System.out.println(s1);
        
        StringBuffer sb = new StringBuffer("Washiqul");
        sb.append(" Islam");
        System.out.println(sb);
        
        StringBuilder sbd = new StringBuilder("TMSS ");
        sbd.append(" Engineering College");
        System.out.println(sbd);
    }
}
