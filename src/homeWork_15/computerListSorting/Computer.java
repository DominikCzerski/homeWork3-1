package homeWork_15.computerListSorting;

import java.util.Comparator;

public class Computer{

	private String name;
	private int cpu;
	private int memory;

	public Computer(String name, int cpu, int memory) {
		this.name = name;
		this.cpu = cpu;
		this.memory = memory;
	}

	public String getName() {
		return name;
	}

	public int getCpu() {
		return cpu;
	}

	public int getMemory() {
		return memory;
	}


	public static class ComputerNameComparator implements Comparator<Computer> {

		@Override
		public int compare(Computer computer1, Computer computer2) {
			if (computer1.name == null && computer2.name == null)
				return 0;
			if (computer1.name == null)
				return 1;
			else if (computer2.name == null)
				return -1;
			return computer1.name.compareTo(computer2.name);
		}
	}

	public static class ComputerCpuComparator implements Comparator<Computer> {

		@Override
		public int compare(Computer computer1, Computer computer2) {
			if (computer1.cpu > computer2.cpu) {
				return 1;
			} else if (computer1.cpu < computer2.cpu) {
				return -1;
			}
			return 0;
		}
	}

	public static class ComputerMemoryComparator implements Comparator<Computer> {

		@Override
		public int compare(Computer computer1, Computer computer2) {
			if (computer1.memory > computer2.memory) {
				return 1;
			} else if (computer1.memory < computer2.memory) {
				return -1;
			}
			return 0;
		}
	}

	@Override
	public String toString() {
		return "Computer " + name + " cpu speed " + cpu + " memory " + memory;
	}
}

