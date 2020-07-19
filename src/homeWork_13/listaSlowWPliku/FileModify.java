package homeWork_13.listaSlowWPliku;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileModify {

    static ArrayList<String> read(String fileName) {
        ArrayList<String> strings = new ArrayList<>();
        try (var fileReader = new FileReader(fileName);
             var reader = new BufferedReader(fileReader)) {

            String currentLine;
            while ((currentLine = reader.readLine()) != null) {
                strings.add(currentLine);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return strings;

    }
}
