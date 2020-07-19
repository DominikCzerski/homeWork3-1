package homeWork_12.statystykiFirmy;

import homeWork_12.bazaProduktowWPliku.Product;

import java.io.*;

public class FileModify {

    public static void saveStatistics(String fileName, Company company) {
        try
                (var fileWriter = new FileWriter(fileName);
                 var bufferedWriter = new BufferedWriter(fileWriter);
                ) {

            bufferedWriter.write("Srednia wypłata: " + company.averageSalary());
            bufferedWriter.newLine();
            bufferedWriter.write("Najmniejsza wypłata: " + company.lowestSalary());
            bufferedWriter.newLine();
            bufferedWriter.write("Najwieksza wypłata: " + company.highestSalary());
            bufferedWriter.newLine();
            bufferedWriter.write("Liczba pracowników w dziale IT: " + company.whichDepartment("it"));
            bufferedWriter.newLine();
            bufferedWriter.write("Liczba pracowników w dziale Management: " + company.whichDepartment("management"));
            bufferedWriter.newLine();
            bufferedWriter.write("Liczba pracowników w dziale Support: " + company.whichDepartment("support"));
            bufferedWriter.newLine();

        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }


    static Employee[] read(String fileName) {
        int numberOfLines = FileModify.numberOfLines(fileName);
        Employee[] result = new Employee[numberOfLines];
        try (
                var fileReader = new FileReader(fileName);
                var bufferReader = new BufferedReader(fileReader);
        ) {
            String nextLine = null;
            for (int i = 0; i < numberOfLines; i++) {
                nextLine = bufferReader.readLine();
                String[] splitLine = nextLine.split(";");
                result[i] = new Employee(splitLine[0], splitLine[1], splitLine[2], splitLine[3], Double.parseDouble(splitLine[4]));
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

