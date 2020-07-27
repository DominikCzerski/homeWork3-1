package homeWork_15.wynikiZawodow;

import homeWork_12.bazaProduktowWPliku.Product;
import homeWork_12.statystykiFirmy.Company;
import homeWork_12.statystykiFirmy.Employee;

import java.io.*;
import java.util.List;

public class FileModify {

    public static void save(String fileName, List<Competitor> competitors) {
        try
                (var fileWriter = new FileWriter(fileName);
                 var bufferedWriter = new BufferedWriter(fileWriter);
                ) {
            for (Competitor competitor : competitors) {
                bufferedWriter.write(competitor.information());
                bufferedWriter.newLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

