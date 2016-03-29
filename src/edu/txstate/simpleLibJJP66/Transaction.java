package edu.txstate.simpleLibJJP66;
import java.io.Serializable;

//basic class for a single transaction
public class Transaction implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String user, book;
	private int userType;
	
	public Transaction(){
		user = null;
		book = null;
		setUserType(0);
	}
	
	public Transaction(String user, String book, int type){
		this.user = user;
		this.book = book;
		this.setUserType(type);
	}
	
	@Override
	public String toString(){
		return "\nName: " + user + "\nBook: " + book + "\n";
	}
	
	public String getUser(){
		return user;
	}
	public String getBook(){
		return book;
	}

	public int getUserType() {
		return userType;
	}

	public void setUserType(int userType) {
		this.userType = userType;
	}
}
