package csv;



import com.opencsv.CSVReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.logging.Logger;

public class CsvConverter {

    public static final char FILE_DELIMITER = ',';
    public static final String FILE_EXTN = ".xlsx";
    public static final String FILE_NAME = "EXCEL_DATA";

    private static Logger logger = Logger.getLogger(String.valueOf(CsvConverter.class));
    public static void main(String[] args) throws FileNotFoundException {

        String csvpath = "src/test/resources/Contribution_Header_File_20220708130032.csv";
        String[] nextLine;
        CSVReader reader = new CSVReader(new FileReader(csvpath));




    }
}
