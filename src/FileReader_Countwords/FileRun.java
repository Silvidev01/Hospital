package FileReader_Countwords;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileRun {
    private static final Logger LOGGER = LogManager.getLogger(FileRun.class);


    public static void main(String[] args) throws IOException {

        try {
            BufferedReader br = null;
            try {
                br = new BufferedReader(new java.io.FileReader(System.getProperty("user.dir") + "\\src\\java desc.txt"));
            } catch (FileNotFoundException ex) {
                throw new RuntimeException(ex);
            }
            File textFile = null;
            FileReader.countWords(textFile);

        } catch (IOException e) {
            LOGGER.error("Can't find some of the files",e);
        }
}
}