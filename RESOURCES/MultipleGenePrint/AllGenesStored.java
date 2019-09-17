
/**
 * Write a description of class AllGenes here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import edu.duke.*;
public class AllGenesStored
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
       //int minIndex = Math.min(Math.min(taaIndex, tagIndex), tgaIndex);
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
   
   public StorageResource getAllGenes(String dna){
       //create an empty StorageResource, call it geneList
       StorageResource geneList = new StorageResource();
       //Set startIndex to 0
       int startIndex = 0;
       //Repeat the following steps
       while(true){
           //Find the next gene after startIndex
           String currentGene = findGene (dna, startIndex);
           //If no gene was found, leave this loop
           if(currentGene.isEmpty()){
                break;
           }
           //Add that gene to geneList
           geneList.add(currentGene);
           
           //Set stratIndex to just past the end of the gene
           startIndex = dna.indexOf(currentGene, startIndex) + currentGene.length();
       }
       //Your answer is geneList
       return geneList;
   }
   
   public void testOn(){
       FileResource fr = new FileResource();
       String dna = fr.asString();
       System.out.println("Testing getAllGenes on " + dna);
       StorageResource genes = getAllGenes(dna);
       for(String g: genes.data()){
           System.out.println(g);
       }
   }
   
   /*public void test(){
   
       System.out.println("1st test");
       testOn("ATGATCTAATTTATGCTGCAACGGTGAAGA");
       System.out.println("2nd test");
       testOn("");
       System.out.println("3rd test");
       testOn("ATGATCATAAGAAGATAATAGAGGGCCATGTAA");
   }   
   
   public void testOn(String dna){
   
       System.out.println("Testing getAllGenes on " + dna);
       StorageResource genes = getAllGenes(dna);
       for(String g: genes.data()){
           System.out.println(g);
       }
   }
   */
   public void test(){
       //http://www.dukelearntoprogram.com/course2/doc/
       
       
       testOn();
   }   
}
