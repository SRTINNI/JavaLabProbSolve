package Gene;

import java.io.*;

/**
 * Write a description of class AllGenes here.
 *
 * @author (M A Mazedul Islam)
 * @version (a version number or a date)
 */
public class AllGenes
{
    public int findStopCodon(String dnaStr, int startIndex, String stopCodon){
       int currIndex = dnaStr.indexOf(stopCodon, startIndex+3);
       while(currIndex != -1){
           
           int diff = currIndex - startIndex;
           if (diff % 3 == 0)
                return currIndex;
           else
                currIndex = dnaStr.indexOf(stopCodon, currIndex + 1);
       }
       return -1;
   }
   
   public String findGene(String dna, int where){
   
       int startIndex = dna.indexOf("ATG", where);
       if(startIndex == -1)
            return "";
       int taaIndex = findStopCodon(dna, startIndex, "TAA");
       int tagIndex = findStopCodon(dna, startIndex, "TAG");
       int tgaIndex = findStopCodon(dna, startIndex, "TGA");
       
       int minIndex = 0;

       if (taaIndex == -1 || (tgaIndex != -1 && tgaIndex < taaIndex))
            minIndex = tgaIndex;
       else
            minIndex = taaIndex;
      
       if (minIndex == -1 || (tagIndex != -1 && tagIndex < minIndex))
            minIndex = tagIndex;
              
       if (minIndex == -1)
            return "";
       return dna.substring(startIndex, minIndex + 3);
   }
   
   public void printAllGenes(String dna) {

       int check = 1;
       int startIndex = 0;
       while (true) {

           String currentGene = findGene(dna, startIndex);
           if (currentGene.isEmpty()) {
               break;
           }

           printGene(check,dna,currentGene);
           check++;
           startIndex = dna.indexOf(currentGene, startIndex) + currentGene.length();
       }
   }

  void printGene(int check,String dna,String gene){

      String outputFile = "/home/mazedul/Java/MultipleGenePrintInFile/src/IOFile/Output.txt";
      try {

          FileWriter fileWriter = new FileWriter(outputFile,true);
          BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

          // Note that write() does not automatically
          // append a newline character.
          if(check == 1) {

              bufferedWriter.newLine();
              bufferedWriter.write("DNA : "+dna);
              bufferedWriter.newLine();

          }


          bufferedWriter.write("Gene "+check +" : "+gene);
          bufferedWriter.newLine();
          // Always close files.
          bufferedWriter.close();
      }
      catch(IOException ex) {
          System.out.println("Error writing to file "+ outputFile + "");
          // Or we could just do this:
          // ex.printStackTrace();
      }
  }
   
   public void testOn(String dna){
       printAllGenes(dna);

   }
   
   public void test(){

        String inputFile = "/home/mazedul/Java/MultipleGenePrintInFile/src/IOFile/Dna.txt";
        String line = null;
        try{
            FileReader fileReader = new FileReader(inputFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while((line = bufferedReader.readLine()) != null) {
                //System.out.println(line);
                testOn(line);
            }
            bufferedReader.close();
        }

        catch(FileNotFoundException ex) {
            System.out.println("Unable to open file '" + inputFile + "'");
        }
        catch(IOException ex) {
            System.out.println("Error reading file '" + inputFile + "'");
            // Or we could just do this:
            // ex.printStackTrace();
        }


   }



   public static void main(String[] args){
        AllGenes ob = new AllGenes();
        ob.test();
   }
}
