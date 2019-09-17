/**
 * Write a description of class WriteToFIleExample here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.io.File;
import java.io.*;
import java.io.IOException;
public class WriteToFIleExample
{
    public static void main(){
        try{
            String content = "This is the content to write into file.";
            String content1 = "This the Second content to write into the file.";
            File file = new File("D:/newfilename.txt");
            
            if (!file.exists()){
                file.createNewFile();
                FileWriter fw = new FileWriter(file,true);
                BufferedWriter bw = new BufferedWriter(fw);
            
                bw.write(content);
                bw.newLine();
                bw.write(content1);
                bw.newLine();
                bw.close();
                System.out.println("Done");
            }
            else{
                System.out.println("File already exists.");
            }
        } catch(IOException e){
            
        }
    }
}
