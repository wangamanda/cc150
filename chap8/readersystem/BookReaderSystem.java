package readersystem;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

public class BookReaderSystem {
	private static BookReaderSystem instance;
	Set<Reader> readers;
	HashMap<Category, List<Book>> books;

	public BookReaderSystem() {
		readers = new HashSet<Reader>();
		books = new HashMap<Category, List<Book>>();
	}

	public static BookReaderSystem getInstance() {
		if (instance == null) {
			instance = new BookReaderSystem();
		}
		return instance;
	}

	public static void addReader(Reader reader) {
		readers.add(reader);
	}

	public static List<Book> searchBookByCategory(Category c) {
		if (books.containsKey(c)) {
			return books.get(c);
		} else {
			System.out.println("found 0 results");
			return null;
		}
	}

	public void setBookBorrowed(Book book) {
		book.isAvailable = false;
		for (Category c : books) {
			List<Book> list = books.get(c);
			for (Book b : list) {
				if (b.equals(book)) {
					list.remove(b);
				}
			}
		}
	}

	public void void addBook(Book book) {
		for (Category c : books) {
			if (c.toString().equals(book.getCategory())) {
				List<Book> list = books.get(c);
				list.add(book);
				book.isAvailable = true;
			}
		}
	}

	public static Book searchBookByName(String name) {
		for (Category c : books) {
			List<Book> list = books.get(c);
			for (Book book : list) {
				if (book.getName().equals(name)) {
					book.printBook();
					return book;
				}
			}
		}
		System.out.println("found 0 results");
		return null;
	}
}
