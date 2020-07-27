package homeWork_15.wynikiZawodow;

public class Competitor implements Comparable<Competitor> {

	private String name;
	private String lastName;
	private double score;

	public Competitor(String name, String lastName, double score) {
		this.name = name;
		this.lastName = lastName;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public String getLastName() {
		return lastName;
	}

	public double getScore() {
		return score;
	}

	@Override
	public int compareTo(Competitor competitor) {
		if (this.score > competitor.getScore()) {
			return -1;
		} else if (this.score < competitor.getScore()) {
			return 1;
		}
		int nameCompare = this.name.compareTo(competitor.name);
		if (nameCompare != 0) {
			return nameCompare;
		}
		return this.lastName.compareTo(competitor.lastName);
	}

	public String information() {
		return name + " " + lastName + ";" + score;
	}
}

