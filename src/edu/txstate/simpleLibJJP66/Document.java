package edu.txstate.simpleLibJJP66;

import java.io.Serializable;

public class Document implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3566245322477258678L;
	protected String title;
	protected String publisher;
	protected String date;
	protected int copies;
	
	public DocumentSearch searchType;
	
	public void setTitle(String newTitle){
		this.title = newTitle;
	}
	public String getTitle(){
		return this.title;
	}
	
	public void setPublisher(String newPublisher){
		this.publisher = newPublisher;
	}
	
	public String getPublisher(){
		return this.publisher;
	}
	
	public void setDate(String newDate){
		this.date = newDate;
	}
	
	public String getDate(){
		return this.date;
	}
	
	public void setCopies(int newCopies){
		this.copies= newCopies;
	}
	
	public int getCopies(){
		return this.copies;
	}

	public void updateBorrow() {
		copies -= 1;
		
	}

	public void updateReturn() {
		copies +=1;
		
	}

}
