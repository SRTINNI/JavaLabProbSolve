
/**
 * Write a description of class BufferedReaderExample here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.io.*;
public class BufferedReaderExample
{
    public static void main(){
        try{
            BufferedReader br = new BufferedReader (new FileReader("D:\\technical.txt"));
            String sCurrentLine;
            while((sCurrentLine = br.readLine()) != null)
                System.out.println(sCurrentLine);
            br.close();
        } catch(IOException e){
            e.printStackTrace();
            //System.out.println(e);
            //System.err.println(e);
        }
    }
}
