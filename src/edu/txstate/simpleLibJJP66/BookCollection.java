package edu.txstate.simpleLibJJP66;

import java.io.Serializable;
import java.util.LinkedList;

public class BookCollection extends DocumentCollection implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1475966287610862386L;
	// Creation of new list of books
	static LinkedList<Book> LinkList;
//	private static LinkedList<Book> linkedListOfBooks;
	
	public static DocumentSearch searchType;


	// constructor of list of book
	public BookCollection() {
		LinkList = new LinkedList<Book>();
	}

	// adds a new book
	public void addBook(Book newBook) {
		LinkList.add(newBook);
	}

	// removes a book
	public void removeBook(Book removeBook) {
		LinkList.remove(removeBook);
	}

	// lists all books in the collection
	public String listBookCollection() {
		String total = "";

		for (int i = 0; i < LinkList.size(); i++) {
			Book TempBook = LinkList.get(i);
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

			for (int i = 0; i < LinkList.size(); i++) {
				Book TempBook = LinkList.get(i);
				// If statement to compare to title and publisher and author
				if (TempBook.getTitle().equals(input) || TempBook.getPublisher().equals(input)
						|| TempBook.findAuthor(input) == true) {
					output = "\n" + TempBook.displayBook();
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
			for (int i = 0; i < LinkList.size(); i++) {
				Book b = LinkList.get(i);
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
			for (int i = 0; i < LinkList.size(); i++) {
				Book b = LinkList.get(i);
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
	
	public void tryToSearch(String input){
		searchType.search(input);
	}

	// end class
}
