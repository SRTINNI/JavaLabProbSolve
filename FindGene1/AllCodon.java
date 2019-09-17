
/**
 * Write a description of class AllCodon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AllCodon
{
   
    public int findStopCodon(String dnaStr,int startIndex,String stopCodon)
    {
        int currIndex=dnaStr.indexOf(stopCodon,startIndex+3);
        while(currIndex!=-1)
        {
            int diff=currIndex-startIndex;
            if(diff%3==0)
            {
                return currIndex;
            }
            else
            {
                currIndex=dnaStr.indexOf(stopCodon);
            }
        }
        return dnaStr.length();
    }
    public String findGene(String dna)
    {
        int startIndex=dna.indexOf("ATG");
        if(startIndex==-1)
        {
            return "";
        }
        int taaIndex=findStopCodon(dna,startIndex,"TAA");
        int tagIndex=findStopCodon(dna,startIndex,"TAG");
        int tgaIndex=findStopCodon(dna,startIndex,"TGA");
        int temp=Math.min(taaIndex,tagIndex);
        int minIndex=Math.min(temp,tgaIndex);
        //int minIndex=Math.min(taaIndex,Math.min(tagIndex,tgaIndex));
        if(minIndex==dna.length())
        {
            return "";
        }
        return dna.substring(startIndex,minIndex+3);
    }
    public void testFindStop()
    {
        /*//String dna="AGATGTAGTTCGTATTAAGCATGATCTAG";
        String dna="xxxyyyzzzTAAxxxyyyzzzTAAxx";
        int dex=findStopCodon(dna,0,"TAA");
        if(dex!=9)
            System.out.println("error on 9");
        dex=findStopCodon(dna,9,"TAA"); 
        if(dex!=21)
            System.out.println("error on 21");
        dex=findStopCodon(dna,1,"TAA");
        if(dex!=26)
            System.out.println("error on 26");
        dex=findStopCodon(dna,0,"TAG");
        if(dex!=26)
            System.out.println("error on 26 TAG");
        System.out.println("Tests finished");*/
        String dna ="AATGCGTATTATGGT";
        System.out.println("DNA strand is  " +dna);
        String gene = findGene(dna);
        System.out.println("Gene is  " +gene);
        
        dna ="AATGCTAGGGTAATATGGT";
        System.out.println("DNA strand is  " +dna);
        gene = findGene(dna);
        System.out.println("Gene is  " +gene);
        
        dna ="ATCCTATGCTTCGGCTGCTCTAATATGGT";
        System.out.println("DNA strand is  " +dna);
        gene = findGene(dna);
        System.out.println("Gene is  " +gene);
        
        dna ="ATGTAA";
        //dna="AGATGTAGTTCGTATTAAGCATGATCTAG";
        System.out.println("DNA strand is  " +dna);
        gene = findGene(dna);
        System.out.println("Gene is  " +gene);
        
    }
    
}
