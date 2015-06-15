package readersystem;

public class Book {
	Category category;
	String id;
	String name;
	String author;
	boolean isAvailable;

	public Book (Category c, String i, String n, String a) {
		category = c;
		id = i;
		name = n;
		author = a;
	}

	public Category getCategory() {
		return category;
	}

	public String getID() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAuthor() {
		return author;
	}

	public void printBook() {
		System.out.println("Book name: "+name);
		System.out.println("Author: "+author);
		System.out.println("Category: "+category.toString());
	}
}
