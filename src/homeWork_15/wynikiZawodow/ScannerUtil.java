package homeWork_15.wynikiZawodow;

import java.util.*;

public class ScannerUtil {

	public static void competitorsSortingAndSavingToFile() {
		Scanner input = new Scanner(System.in);
		List<Competitor> competitors = new ArrayList<>();
		String userInput;
		do {
			System.out.println("Please state full name and score (or type STOP)");
			userInput = input.next();
			if (userInput.equalsIgnoreCase("STOP")) {
				break;
			} else {
				Competitor competitor = new Competitor(userInput, input.next(), input.nextDouble());
				competitors.add(competitor);
			}
		} while (input.hasNextLine());

		Collections.sort(competitors);
		FileModify.save("src/homeWork_15/wynikiZawodow/stats.csv", competitors);

		System.out.println("Data has been sorted and saved to stats.csv file.");

	}
}
