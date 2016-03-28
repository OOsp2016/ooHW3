package edu.txstate.simpleLibJJP66;

import java.io.Serializable;

public class Author implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2703703673890678886L;

	// Variables for Author
	private String name;

	// Default constructor
	public Author() {
		setName("Author Name");
	}

	// Parameter constructor
	public Author(String ConstructName) {
		setName(ConstructName);
	}

	// Getter for First Name Variable
	public String getName() {
		return name;
	}

	// Setter First Name Variable
	public void setName(String newName) {
		this.name = newName;
	}

	// Overrides equals function so object can be removed
	@Override
	public boolean equals(Object obj) {
		return (this.FirstName.equals(((Author) obj).FirstName) && (this.LastName.equals(((Author) obj).LastName)));

	}

	// end class
}
