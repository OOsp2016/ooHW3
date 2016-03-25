package edu.txstate.simpleLibJJP66;

import java.io.Serializable;

public class Article implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1147093108576196800L;
	//variables for article
	private String ArticleName;
	
	//default constructor
	public Article() {
		setArticleName("A1");
	}
	
	//Parameter constructor
	public Article(String ConstructArticle){
		setArticleName(ConstructArticle);
	}
	
	//getter for article name
	public String getArticleName(){
		return ArticleName;
	}
	
	//setter for article name
	public void setArticleName(String articleName){
		this.ArticleName = articleName;
	}
	
	//overrides equals function to properly compare two article objects
	@Override
	public boolean equals(Object obj) {
		return (this.ArticleName.equals(((Article) obj).ArticleName));
	}
	
	// end class
}
