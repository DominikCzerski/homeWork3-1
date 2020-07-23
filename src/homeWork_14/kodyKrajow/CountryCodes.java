package homeWork_14.kodyKrajow;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountryCodes {


	public static void main(String[] args) {
		Map<String, Country> map = new HashMap<>();
		map = FileUtil.read("src/homeWork_14/kodyKrajow/countryInfo.csv");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Prosze podaj kod kraju");
		Country country = getCountry(map, scanner.nextLine());
		if (country != null) {
			System.out.println(country);
		} else {
			System.out.println("Podałeś zły kod kraju");
		}


	}

	static Country getCountry(Map<String, Country> countryMap, String countryCode) {

		for (Map.Entry<String, Country> entry : countryMap.entrySet()) {
			if (entry.getKey().equals(countryCode)) {
				return entry.getValue();
			}
		}
		return null;
	}
}
