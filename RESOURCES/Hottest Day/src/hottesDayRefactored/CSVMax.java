package hottesDayRefactored;

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
            largestSoFar = getLargestOfTwo(currentRow, largestSoFar);
        }
        //The largestSoFar was our answer
        return largestSoFar;
    }

    public CSVRecord getLargestOfTwo(CSVRecord currentRow, CSVRecord largestSoFar) {
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
        return largestSoFar;
    }

    public CSVRecord hottestInManyDays() {
        CSVRecord largestSoFar = null;
        DirectoryResource dr = new DirectoryResource();
        //iterate over files
        for (File f : dr.selectedFiles()) {
            FileResource fr = new FileResource(f);
            //use method to ge largest in file.
            CSVRecord currentRow = hottestHourInFile(fr.getCSVParser());
            largestSoFar = getLargestOfTwo(currentRow, largestSoFar);
        }
        return largestSoFar;
    }

    public static void main(String[] args) {
        CSVMax obj = new CSVMax();
        CSVRecord largest = obj.hottestInManyDays();
        //System.out.println("hottest temperature was " + largest.get("TemperatureF") + " at " + largest.get("TimeEST"));
        JOptionPane.showMessageDialog(null, "hottest temperature was " + largest.get("TemperatureF") + " at " + largest.get("DateUTC"));
    }
}
