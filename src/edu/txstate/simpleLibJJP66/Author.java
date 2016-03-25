package edu.txstate.simpleLibJJP66;

import java.io.Serializable;

public class Author implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2703703673890678886L;

	// Variables for Author
	private String FirstName;

	private String LastName;

	// Default constructor
	public Author() {
		setFirstName("First Name");
		setLastName("Last Name");

	}

	// Parameter constructor
	public Author(String ConstructFirstName, String ConstructLastName) {
		setFirstName(ConstructFirstName);
		setLastName(ConstructLastName);
	}

	// Getter for First Name Variable
	public String getFirstName() {
		return FirstName;
	}

	// Setter First Name Variable
	public void setFirstName(String firstName) {
		this.FirstName = firstName;
	}

	// Getter for Last Name
	public String getLastName() {
		return LastName;
	}

	// Setter for Last Name
	public void setLastName(String lastName) {
		this.LastName = lastName;
	}

	// Overrides equals function so object can be removed
	@Override
	public boolean equals(Object obj) {
		return (this.FirstName.equals(((Author) obj).FirstName) && (this.LastName.equals(((Author) obj).LastName)));

	}

	// end class
}
