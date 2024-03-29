
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
            if((currIndex-startIndex)%3==0)
            {
                return currIndex;
            }
            else
            {
                currIndex=dnaStr.indexOf(stopCodon,currIndex+1);
            }
        }
        return dnaStr.length();//will cause problem in finding multiple gene
       //return -1;
        
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
        /*int temp=Math.min(taaIndex,tagIndex);
        int minIndex=Math.min(temp,tgaIndex);
        //int minIndex=Math.min(Math.min(taaIndex,tgaIndex),tgaIndex);
        if(minIndex==dna.length())
        {
            return "";
        }*/
        int minIndex=0;
        if(taaIndex==-1 ||(tgaIndex!=-1 && tgaIndex<taaIndex))
           minIndex=tgaIndex;
        else 
           minIndex=taaIndex;
        if(minIndex==-1 ||(tagIndex!=-1 && tagIndex<minIndex))
           minIndex=tagIndex;
        if(minIndex==-1)
           return "";
           
        return dna.substring(startIndex,minIndex+3);
    }
    
    public void testFindStop()
    {
        String dna="xxxyyyxxxTAAxxxyyyzzzTAAxx";
        
        int dex = findStopCodon(dna,0,"TAA");
        if(dex!=9)
           System.out.println("Error on 9");
           
        dex=findStopCodon(dna,9,"TAA");
        if(dex!=21)
           System.out.println("Error on 21");
           
        dex=findStopCodon(dna,1,"TAA");
        if(dex!=26)
           System.out.println("Error on 26");
           
        dex=findStopCodon(dna,0,"TAG");
        if(dex!=26)
           System.out.println("Error on 26");
           
        System.out.println("Tests finished");
    }
    public void testFindGene()
    {
        String dna="ATGCCCGGGAAATAACCC";
        String gene=findGene(dna);
        
        if(!gene.equals("ATGCCCGGGAAATAA"))
           System.out.println("error");
           
        System.out.println("tests finished");   
    }
    
}
