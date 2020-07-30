package homeWork_16.czteryPoryRoku;

import java.util.Arrays;

public class SeasonsTest {

	public static void main(String[] args) {
		TimeOfYear timeOfYear = new TimeOfYear();
		Season season = Season.fromPolishName(timeOfYear.selectedTimeOfYear());
		timeOfYear.setSeason(season);
		System.out.println(Arrays.toString(season.getMonthsTable()));
	}
}
