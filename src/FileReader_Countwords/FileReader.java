package FileReader_Countwords;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;


public class FileReader {

        private static final Logger LOGGER = LogManager.getLogger(FileReader.class);



    public static void countWords(File newfile) throws IOException {
        int i = 0;
        String[] wordsarray = new String[0];
        try {
            BufferedReader br = null;
            try {
                br = new BufferedReader(new java.io.FileReader(System.getProperty("user.dir") + "\\src\\java desc.txt"));
            } catch (FileNotFoundException ex) {
                throw new RuntimeException(ex);
            }
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                wordsarray = line.split(" ");
                i += wordsarray.length;
                line = br.readLine();
            }
            br.close();
        } catch (FileNotFoundException e) {
            LOGGER.error(e);

        } catch (IOException e) {
            LOGGER.error(e);
        }

        HashMap<String, Integer> ocurrencyMap = new HashMap<>();

        for (String word : wordsarray) {
            word = word.replaceAll("[\\.\\,\\(\\)\\[\\]]", "");
            if (ocurrencyMap.containsKey(word)) {
                ocurrencyMap.put(word, ocurrencyMap.get(word) + 1);
            } else {
                ocurrencyMap.put(word, 1);
            }
        }
        for (HashMap.Entry<String, Integer> entry : ocurrencyMap.entrySet()) {
            System.out.printf("Word '%s' appears %d time/s\n ",entry.getKey(), entry.getValue());
        }
    }
}

