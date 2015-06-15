package readersystem;

public enum Category{
	Science,
	Nature,
	Engineering,
	Art,
	Philosophy,
	Magazine,
	Newspaper;

	public String toString() {
		switch(this) {
			case Science:
				return "Science";
			case Nature:
				return "Nature";
			case Engineering:
				return "Engineering";
			case Art:
				return "Art";
			case Philosophy:
				return "Philosophy";
			case Magazine:
				return "Magazine";
			case Newspaper:
				return "Newspaper";
		}
	}
}
