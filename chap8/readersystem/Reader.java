package readersystem;
import java.util.List;
import java.util.ArrayList;

public class Reader {
	String id;
	String name;
	List<Book> borrowedBooks;

	public Reader(String id, String name) {
		this.id = id;
		this.name = name;
		borrowedBooks = new ArrayList<Book>();
	}

	public boolean borrowBook(Book book) {
		if (borrowedBooks.size() < 5 && book.isAvailable) {
			borrowedBookes.add(book);
			BookReaderSystem.setBookBorrowed(book);
			return true;
		} else {
			return false;
		}
	}
}
