package edu.txstate.simpleLibJJP66;

import java.io.Serializable;

public class Book extends Document {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6761136501477404289L;

	// Book variables
	private String Title;

	private String Publisher;

	private String Date;

	private String ISBN;

	private int Copies;

	// Array list of authors for object book
	private AuthorCollection AuthorListForBook = null;

	// Default constructor
	public Book() {

		AuthorListForBook = new AuthorCollection();

		setTitle("Default Title");
		setPublisher("Default Publisher");
		setDate("Default Date");
		setISBN("Default ISBN");
		setCopies(1);

		// create author object
		Author DefaultAuthor = new Author();
		AuthorListForBook.addAuthor(DefaultAuthor);

	}

	// Parameter constructor
	public Book(String ConstructTitle, String ConstructPublisher, String ConstructDate, String ConstructISBN,
			int ConstructCopies, String ConstructAuthorFirstName, String ConstructAuthorSecondName) {

		AuthorListForBook = new AuthorCollection();

		setTitle(ConstructTitle);
		setPublisher(ConstructPublisher);
		setDate(ConstructDate);
		setISBN(ConstructISBN);
		setCopies(ConstructCopies);

		// creates author object, and removes the default one because apparently
		// it will always be created.
		Author SpecifiedAuthor = new Author(ConstructAuthorFirstName, ConstructAuthorSecondName);
		AuthorListForBook.addAuthor(SpecifiedAuthor);
	}

	// Getters and Setters for the variables
	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		this.Title = title;
	}

	public String getPublisher() {
		return Publisher;
	}

	public void setPublisher(String publisher) {
		this.Publisher = publisher;
	}

	public String getDate() {
		return Date;
	}

	public void setDate(String date) {
		this.Date = date;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		this.ISBN = iSBN;
	}

	public int getCopies() {
		return Copies;
	}

	public void setCopies(int copies) {
		this.Copies = copies;
	}
	// End getters and setters for variables

	// displays book
	public String displayBook() {
		return "Title: " + Title + "\nPublisher: " + Publisher + "\nDate: " + Date + "\nISBN: " + ISBN + "\nCopies: "
				+ Copies + "\nAuthor(s): " + getAuthors();
	}

	// Gets list of authors
	public String getAuthors() {
		return AuthorListForBook.displayAuthors();
	}

	// adds an author
	public void addAnAuthor(String NewAuthorFirstName, String NewAuthorLastName) {
		Author newAuthor = new Author();
		newAuthor.setFirstName(NewAuthorFirstName);
		newAuthor.setLastName(NewAuthorLastName);
		AuthorListForBook.addAuthor(newAuthor);
	}

	// removes an author
	public void removeAnAuthor(String AuthorToRemoveFirstName, String AuthorToRemoveLastName) {
		Author removeAuthor = new Author();
		removeAuthor.setFirstName(AuthorToRemoveFirstName);
		removeAuthor.setLastName(AuthorToRemoveLastName);
		AuthorListForBook.removeAuthor(removeAuthor);
	}

	// find an author
	public Boolean findAuthor(String input) {
		return AuthorListForBook.searchAuthors(input);
	}

	public void updateBorrow() {
		Copies -= 1;
		
	}

	public void updateReturn() {
		Copies +=1;
		
	}

	// end class
}
