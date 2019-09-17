
import edu.duke.*;
import org.apache.commons.csv.*;
import java.io.*;
import javax.swing.JOptionPane;

public class CSVMax {
        
    public CSVRecord hottestHourInFile(CSVParser parser) {
        //start with largestSoFar as nothiing
        CSVRecord largestSoFar = null;

        //For each row (currentRow) in the CSV File
        for (CSVRecord currentRow : parser) {
            //If largestSoFar is nothing
            if (largestSoFar == null) {
                //Update largestSoFar to be currentRow
                largestSoFar = currentRow;
            } //Otherwise
            else {
                double currentTemp = Double.parseDouble(currentRow.get("TemperatureF"));
                double largestTemp = Double.parseDouble(largestSoFar.get("TemperatureF"));

                //Check if currentRow’s temperature > largestSoFar’s
                if (currentTemp > largestTemp) {
                    //If so udate largestSoFar to currentRow
                    largestSoFar = currentRow;
                }
            }
        }
        //The largestSoFar was our answer
        return largestSoFar;
    }

    public void testHottestInDay() {
        FileResource fr = new FileResource();
        CSVRecord largest = hottestHourInFile(fr.getCSVParser());
        //System.out.println("hottest temperature was " + largest.get("TemperatureF") + " at " + largest.get("TimeEST"));
        JOptionPane.showMessageDialog(null, "hottest temperature was " + largest.get("TemperatureF") + " at " + largest.get("TimeEST"));
    }

    public static void main(String[] args) {
        CSVMax obj = new CSVMax();
        obj.testHottestInDay();
    }
}
