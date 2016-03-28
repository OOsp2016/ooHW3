package edu.txstate.simpleLibJJP66;

public interface DocumentSearch {

	String info();
	
}

class SearchAuthor implements DocumentSearch{
	public String info(){
		return Document.getAuthor();
	}
}

class SearchTitle implements DocumentSearch{
	public String info(){
		return Document.getTitle();
	}
}

class SearchPublisher implements DocumentSearch{
	public String info(){
		return Document.getPublisher();
	}
}
