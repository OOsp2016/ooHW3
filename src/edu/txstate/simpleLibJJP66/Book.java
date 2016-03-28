package edu.txstate.simpleLibJJP66;

public class Book extends Document {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6106063684215068243L;

	// Book variables
	private String ISBN;

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
			int ConstructCopies, String ConstructAuthorName) {

		AuthorListForBook = new AuthorCollection();

		setTitle(ConstructTitle);
		setPublisher(ConstructPublisher);
		setDate(ConstructDate);
		setISBN(ConstructISBN);
		setCopies(ConstructCopies);

		// creates author object, and removes the default one because apparently
		// it will always be created.
		Author SpecifiedAuthor = new Author(ConstructAuthorName);
		AuthorListForBook.addAuthor(SpecifiedAuthor);
	}

	// Getters and Setters for the variables

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		this.ISBN = iSBN;
	}
	// End getters and setters for variables

	// displays book
	public String displayBook() {
		return "Title: " + title + "\nPublisher: " + publisher + "\nDate: " + date + "\nISBN: " + ISBN + "\nCopies: "
				+ copies + "\nAuthor(s): " + getAuthors();
	}

	// Gets list of authors
	public String getAuthors() {
		return AuthorListForBook.displayAuthors();
	}

	// adds an author
	public void addAnAuthor(String NewAuthorName) {
		Author newAuthor = new Author();
		newAuthor.setName(NewAuthorName);
		AuthorListForBook.addAuthor(newAuthor);
	}

	// removes an author
	public void removeAnAuthor(String AuthorToRemoveName) {
		Author removeAuthor = new Author();
		removeAuthor.setName(AuthorToRemoveName);
		AuthorListForBook.removeAuthor(removeAuthor);
	}

	// find an author
	public Boolean findAuthor(String input) {
		return AuthorListForBook.searchAuthors(input);
	}

// end class
}
