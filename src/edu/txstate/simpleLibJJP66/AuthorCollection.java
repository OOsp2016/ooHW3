package edu.txstate.simpleLibJJP66;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class AuthorCollection implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3612740414129812825L;
	// Creation of new list of authors
	private List<Author> ListOfAuthors;

	// constructor of list of authors
	public AuthorCollection() {
		ListOfAuthors = new ArrayList<Author>();
	}

	// adds a new author
	public void addAuthor(Author newAuthor) {
		ListOfAuthors.add(newAuthor);
	}

	// removes an author
	public void removeAuthor(Author removeAuthor) {
		ListOfAuthors.remove(removeAuthor);
	}

	// displays list of authors
	public String displayAuthors() {
		// String to contain list of Authors
		String AuthorName = "";

		// For loop to navigate the list of authors
		for (int i = 0; i < ListOfAuthors.size(); i++) {

			// temporary author object to get First Name and Last name
			Author TempAuthor = ListOfAuthors.get(i);
			// adds Author list to string
			AuthorName = AuthorName + TempAuthor.getName() + "\n";
		}

		return AuthorName;
	}

	// searches through list of authors and returns boolean
	public Boolean searchAuthors(String input) {
		// author string
		String author = "";
		for (int i = 0; i < ListOfAuthors.size(); i++) {
			Author TempAuthor = ListOfAuthors.get(i);
			author = TempAuthor.getName();
			if (author.equals(input)) {
				return true;
			}
		}
		return false;
	}

	// end class
}
