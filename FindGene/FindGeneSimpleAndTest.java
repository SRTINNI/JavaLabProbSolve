
/**
 * Write a description of class FindGeneSimpleAndTest here.
 *
 * @author (Md. Washiqul Islam)
 * @version (version#1 or a 30/8/2018)
 */
public class FindGeneSimpleAndTest
{
    public String findGeneSimple(String dna){
        //start codon is "ATG"
        //stop codon is "TAA"
        String result ="";
        int startIndex=dna.indexOf("ATG");
        int currIndex=dna.indexOf("TAA",startIndex+3);
        while(currIndex!=-1){
            
            if((currIndex-startIndex)%3==0)
            {
                return dna.substring(startIndex,currIndex+3);
                
            }
            else
            {
                currIndex=dna.indexOf("TAA",++currIndex);
               // currIndex ++;
            }
        }
        return "";  
    }
    
    public void testFindGeneSimple(){
    
        String dna ="AATGCGTAATATGGT";
        System.out.println("DNA strand is  " +dna);
        String gene = findGeneSimple(dna);
        System.out.println("Gene is  " +gene);
        
        dna ="AATGCTAGGGCTAATATGGT";
        System.out.println("DNA strand is  " +dna);
        gene = findGeneSimple(dna);
        System.out.println("Gene is  " +gene);
        
        dna ="ATCCTATGCTTCGGCTGCTCTAATATGGT";
        System.out.println("DNA strand is  " +dna);
        gene = findGeneSimple(dna);
        System.out.println("Gene is  " +gene);
        
        dna ="ATGTAA";
        System.out.println("DNA strand is  " +dna);
        gene = findGeneSimple(dna);
        System.out.println("Gene is  " +gene);
        
    }
}
