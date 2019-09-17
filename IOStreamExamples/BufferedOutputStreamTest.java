
/**
 * Write a description of class BufferedOutputStreamTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.io.*;

public class BufferedOutputStreamTest
{
    public static void main() throws Exception{
        FileOutputStream fout = new FileOutputStream("D:/f1.txt");
        BufferedOutputStream bout = new BufferedOutputStream(fout);
        
        String s = "Mashrafi is my favourite player.";
        byte b[] = s.getBytes();
        bout.write(b);
        
        bout.flush();
        bout.close();
        System.out.println("success");      
    }
}
