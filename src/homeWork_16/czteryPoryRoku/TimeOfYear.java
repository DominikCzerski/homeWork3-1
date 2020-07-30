package homeWork_16.czteryPoryRoku;

import java.util.Scanner;

public class TimeOfYear {

	private Season season;

	public Season getSeason() {
		return season;
	}

	public void setSeason(Season season) {
		this.season = season;
	}

	public String selectedTimeOfYear() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Wybierz porę roku");
		return scanner.nextLine();
	}
}
