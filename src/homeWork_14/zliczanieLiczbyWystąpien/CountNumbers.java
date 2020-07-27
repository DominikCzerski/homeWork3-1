package homeWork_14.zliczanieLiczbyWystąpien;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class CountNumbers {

	public static void main(String[] args) {

		try (
				var fileReader = new FileReader("src/homeWork_14/zliczanieLiczbyWystąpien/numbers.txt");
				var reader = new BufferedReader(fileReader);
		) {
			String currentLine;
			ArrayList<Integer> list = new ArrayList<>();
			while ((currentLine = reader.readLine()) != null) {
				list.add(Integer.parseInt(currentLine));
			}

			countFrequency(list, list.size());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}




	static void countFrequency(ArrayList<Integer> array, int arraySize) {
		Map<Integer, Integer> mp = new HashMap<>();
		for (int i = 0; i < arraySize; i++) {
			if (mp.containsKey(array.get(i))) {
				mp.put(array.get(i), mp.get(array.get(i)) + 1);
			} else {
				mp.put(array.get(i), 1);
			}
		}
		for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
			System.out.println(entry.getKey() + " - liczba wystapien: " + entry.getValue());
		}
	}
}
