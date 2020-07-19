package homeWork_12.bazaProduktowWPliku;

import java.io.*;

public class FileModify {

    public static void add(String fileName, Product[] products) {
        try
                (var fileWriter = new FileWriter(fileName);
                 var bufferedWriter = new BufferedWriter(fileWriter);
                ) {
            for (Product product : products) {
                bufferedWriter.write(product.information());
                bufferedWriter.newLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    static Product[] read(String fileName) {
        int numberOfLines = FileModify.numberOfLines(fileName);
        Product[] result = new Product[numberOfLines];
        try (
                var fileReader = new FileReader(fileName);
                var bufferReader = new BufferedReader(fileReader);
        ) {
            String nextLine = null;
            for (int i = 0; i < numberOfLines; i++) {
                nextLine = bufferReader.readLine();
                String[] splitLine = nextLine.split(";");
                result[i] = new Product(splitLine[0], splitLine[1], Double.parseDouble(splitLine[2]));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    static int numberOfLines(String fileName) {
        int numberOfLines = 0;
        try (
                var fileReader = new FileReader(fileName);
                var bufferReader = new BufferedReader(fileReader);
        ) {
            while ((bufferReader.readLine()) != null) {
                numberOfLines++;
            }

        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        return numberOfLines;

    }

}

