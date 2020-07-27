package homeWork_15.computerListSorting;

import java.util.*;

public class ComputerSortingTest {

	public static void main(String[] args) {
		List<Computer> computerList = new ArrayList<>();
		Computer intel = new Computer(null, 8888, 999);
		Computer amd = new Computer("AMD", 9999, 888);
		Computer dell = new Computer("DELL", 10000, 777);
		computerList.add(intel);
		computerList.add(amd);
		computerList.add(dell);


		chooseHowToSort(computerList);
		System.out.println(computerList);


	}

		private static void chooseHowToSort(List<Computer> computerList) {
		System.out.println("Please choose how do you want computers to be sorted");
		System.out.println("1 - name");
		System.out.println("2 - CPU speed");
		System.out.println("3 - Memory speed");
		Scanner scanner = new Scanner(System.in);
		int i = scanner.nextInt();
		if (i == 1){
			Collections.sort(computerList, new Computer.ComputerNameComparator());
		} else if (i == 2 ){
			Collections.sort(computerList, new Computer.ComputerCpuComparator());
		} else if (i ==3){
			Collections.sort(computerList, new Computer.ComputerMemoryComparator());
		}
	}
}
