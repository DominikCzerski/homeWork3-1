package homeWork_14.kodyKrajow;

public class Country {

	private String countryCode;
	private String name;
	private String population;

	public Country(String countryCode, String name, String population) {
		this.countryCode = countryCode;
		this.name = name;
		this.population = population;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public String getName() {
		return name;
	}

	public String getPopulation() {
		return population;
	}

	@Override
	public String toString() {
		return name + " " + " (" + countryCode + ")" + " ma " + population + " ludnosci.";
	}
}

