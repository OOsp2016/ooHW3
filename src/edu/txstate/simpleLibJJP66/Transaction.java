package edu.txstate.simpleLibJJP66;
import java.io.Serializable;

//basic class for a single transaction
public class Transaction implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String user, book;
	
	public Transaction(){
		user = null;
		book = null;
	}
	
	public Transaction(String user, String book){
		this.user = user;
		this.book = book;
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
}
