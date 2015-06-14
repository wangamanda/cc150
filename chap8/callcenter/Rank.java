package callcenter;

public enum Rank {
	Respondent(0),
	Mananger(1),
	Director(2);

	int level;
	private Rank(int i) {
		level = i;
	}

	public Rank getRank(int i) {
		switch (i) {
			case 0:
				return Respondent;
			case 1:
				return Manager;
			case 2:
				return Director;
		}
	}

	public int getLevel() {
		return level;
	}
}
