
/**
 * Write a description of class BufferedInputStreamTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.io.*;

public class BufferedInputStreamTest
{
    public static void main(){
        try{
            FileInputStream fin = new FileInputStream("D:/f1.txt");
            BufferedInputStream bin = new BufferedInputStream(fin);
            int i;
            while((i = bin.read()) != -1){
                System.out.println((char) i);
            }
            fin.close();
        } catch(Exception e){
            System.out.println(e);
        }
    }
}
