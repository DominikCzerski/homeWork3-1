package homeWork_16.taliaKart;

import java.util.*;

public class CardsNames {

	private List<String> cardNames(String language) {
		List<String> cardNamesList = new ArrayList<>();
		if (language.equals("PL")) {
			cardNamesList.add("Dwójka");
			cardNamesList.add("Trójka");
			cardNamesList.add("Czwórka");
			cardNamesList.add("Piątka");
			cardNamesList.add("Szóstka");
			cardNamesList.add("Siódemka");
			cardNamesList.add("Ósemka");
			cardNamesList.add("Dziewiątka");
			cardNamesList.add("Dzisiątka");
			cardNamesList.add("Walet");
			cardNamesList.add("Dama");
			cardNamesList.add("Król");
			cardNamesList.add("As");
		} else if (language.equals("EN")) {
			cardNamesList.add("Two");
			cardNamesList.add("Three");
			cardNamesList.add("Four");
			cardNamesList.add("Five");
			cardNamesList.add("Six");
			cardNamesList.add("Seven");
			cardNamesList.add("Eight");
			cardNamesList.add("Nine");
			cardNamesList.add("Ten");
			cardNamesList.add("jack");
			cardNamesList.add("queen");
			cardNamesList.add("king");
			cardNamesList.add("ace");
		}
		return cardNamesList;
	}


	private ArrayList<String> fullCardNames(String language) {
		ArrayList<String> fullCardNames = new ArrayList<>();
		ArrayList<String> cardFigures = Cards.names(language);
		List<String> cardNamesList = cardNames(language);
		int i = 0;
		int l = 0;
		for (int j = 0; j < (cardNamesList.size() * cardFigures.size()); j++) {
			fullCardNames.add(cardNamesList.get(l) + " " + cardFigures.get(i) + "\n");
			l++;
			if (l >= cardNamesList.size()) {
				l = 0;
				i++;
			}
		}
		return fullCardNames;
	}

	public ArrayList<String> choseLanguage() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please type cards language (PL/EN)");
		String chosenLanguage = scanner.nextLine();

		while (!(chosenLanguage.equals("PL") || chosenLanguage.equals("EN"))) {
			System.out.println("Please try again");
			chosenLanguage = scanner.nextLine();
		}
		return fullCardNames(chosenLanguage);
	}
}
