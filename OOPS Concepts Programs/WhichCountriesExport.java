/**
 * Reads a chosen CSV file of country exports and prints each country that exports coffee.
 * 
 * @author Duke Software Team 
 */
import edu.duke.*;
import org.apache.commons.csv.*;
import java.lang.String;

public class WhichCountriesExport {
	public void listExporters(CSVParser parser, String exportOfInterest) {
		//for each row in the CSV File
		int cnt=0;
		   
            for(CSVRecord record : parser){
                String export = record.get("Exports");
                if(export.contains(exportOfInterest)){
                    String country = record.get("Country");
                    cnt=cnt+1;
                    System.out.println(country);
                }
            }
			//Look at the "Exports" column

			//Check if it contains exportOfInterest

				//If so, write down the "Country" from that row

	}
	
	public void listCountries(CSVParser parser, String exportOfInterest){
	    //, String exportOfInterest1) {
		//for each row in the CSV File
            for(CSVRecord record : parser){
                String export = record.get("Country");
                if(export.contains(exportOfInterest)){ 
               // && export.contains(exportOfInterest1)){
                    String country = record.get("Exports");
                    System.out.println(country);
                }
            }
	}

	public void whoExportsCoffee() {
		FileResource fr = new FileResource();
		CSVParser parser = fr.getCSVParser();
		listExporters(parser, "cocoa");
	}
	
}
