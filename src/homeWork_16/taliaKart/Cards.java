package homeWork_16.taliaKart;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public enum Cards {

	TREFL("zołądź", "clubs"),
	KARO("dzwonek", "diamonds"),
	KIER("serce", "hearts"),
	PIK("wino", "spades");

	private String polishName;
	private String englishName;

	Cards(String polishName, String englishName) {
		this.polishName = polishName;
		this.englishName = englishName;
	}

	public String getPolishName() {
		return polishName;
	}

	public String getEnglishName() {
		return englishName;
	}

	public static ArrayList<String> names(String language) {
		ArrayList<String> strings = new ArrayList<>();
		Cards [] values = values();
		for (Cards value : values) {
			if (language.equals("PL")) {
				strings.add(value.getPolishName());
			} else {
				strings.add(value.getEnglishName());
			}
		}
		return strings;
	}

}
