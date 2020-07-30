package homeWork_16.czteryPoryRoku;

public enum Season {

	SPRING("wiosna", new String[]{"mar", "kwi", "maj"}),
	SUMMER("lato", new String[]{"cze", "lip", "sie"}),
	AUTUMN("jesien", new String[]{"wrz", "paz", "lis"}),
	WINTER("zima", new String[]{"gru", "sty", "lut"});

	private String polishName;
	private String[] monthsTable;

	Season(String polishName, String[] monthsTable) {
		this.polishName = polishName;
		this.monthsTable = monthsTable;
	}

	public String getPolishName() {
		return polishName;
	}

	public String[] getMonthsTable() {
		return monthsTable;
	}

	public static Season fromPolishName(String name) {
		Season[] values = values();
		for (Season value : values) {
			if (value.getPolishName().equals(name)) {
				return value;
			}
		}
		return null;
	}
}
