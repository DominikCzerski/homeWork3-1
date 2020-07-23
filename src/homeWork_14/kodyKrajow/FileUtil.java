package homeWork_14.kodyKrajow;

import homeWork_12.statystykiFirmy.Employee;
import homeWork_12.statystykiFirmy.FileModify;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class FileUtil {

	static Map<String , Country> read(String fileName) {
		int numberOfLines = FileUtil.numberOfLines(fileName);
		Map<String, Country> result = new HashMap<>();
		try (
				var fileReader = new FileReader(fileName);
				var bufferReader = new BufferedReader(fileReader);
		) {
			String nextLine = null;
			for (int i = 0; i < numberOfLines; i++) {
				nextLine = bufferReader.readLine();
				String[] splitLine = nextLine.split(";");
				Country country = new Country(splitLine[0], splitLine[1], splitLine[2]);
				result.put(splitLine[0],country);

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
