package edu.txstate.simpleLibJJP66;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BookCollection extends DocumentCollection implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1475966287610862386L;
	// Creation of new list of books
	private static LinkedList<Book> ListOfBooks;
//	private static LinkedList<Book> linkedListOfBooks;
	
	public static DocumentSearch searchType;


	// constructor of list of book
	public BookCollection() {
		ListOfBooks = new LinkedList<Book>();
	}

	// adds a new book
	public void addBook(Book newBook) {
		ListOfBooks.add(newBook);
	}

	// removes a book
	public void removeBook(Book removeBook) {
		ListOfBooks.remove(removeBook);
	}

	// lists all books in the collection
	public String listBookCollection() {
		String total = "";

		for (int i = 0; i < ListOfBooks.size(); i++) {
			Book TempBook = ListOfBooks.get(i);
			total = total + TempBook.getTitle() + "\n" + TempBook.getPublisher() + "\n" + TempBook.getDate() + "\n"
					+ TempBook.getISBN() + "\n" + TempBook.getCopies() + "\n" + TempBook.getAuthors() + "\n";
		}

		return total;
	}

	public void searchBooks(String input) {
		Boolean search = true;
		Boolean found = false;
		String output = null;
		while (search) {

			for (int i = 0; i < ListOfBooks.size(); i++) {
				Book TempBook = ListOfBooks.get(i);
				// If statement to compare to title and publisher and author
				if (TempBook.getTitle().equals(input) || TempBook.getPublisher().equals(input)
						|| TempBook.findAuthor(input) == true) {
					output = TempBook.displayBook();
					System.out.println(output);
					found = true;
					// end if statement
				}
				// end for loop
			}
			// if statement to display if book not found
			if (!found) {
				System.out.println("Book not found!");
			}
			search = false;
		}
	}

	public String Borrow(String Borrow) {
		boolean found = false;
		String borrowedBook = null;
			for (int i = 0; i < ListOfBooks.size(); i++) {
				Book b = ListOfBooks.get(i);
				if (b.getTitle().equals(Borrow)){
					found = true;
					b.updateBorrow();
					borrowedBook=b.getTitle();
				}
			}
			if(!found){
				System.out.println("Book not found!");
				return "nothing";
			}
			return borrowedBook;
	}

	public String returnBook(String returnItem) {
		boolean found = false;
		String returnedBook = null;
			for (int i = 0; i < ListOfBooks.size(); i++) {
				Book b = ListOfBooks.get(i);
				if (b.getTitle().equals(returnItem)) {
					found = true;
					b.updateReturn();
					returnedBook=b.getTitle();
				}
			}
			if(!found){
				System.out.println("Book not found!");
				return "nothing";
			}
			return returnedBook;
	}
	
	public static void tryToSearch(String input, BookCollection listOfBooks){
		searchType.search(input, listOfBooks);
	}

	// end class
}
