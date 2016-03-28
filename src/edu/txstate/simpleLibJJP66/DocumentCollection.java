package edu.txstate.simpleLibJJP66;

import java.io.Serializable;
import java.util.LinkedList;

public class DocumentCollection implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1667112761830378859L;
	private static LinkedList<Document> linkedListOfDocuments;
	
	public DocumentCollection() {
		linkedListOfDocuments = new LinkedList<Document>();
	}
	
	// adds a new book
	public void addDocument(Document newDocument) {
		linkedListOfDocuments.add(newDocument);
	}

	// removes a book
	public void removeBook(Document removeDocument) {
		linkedListOfDocuments.remove(removeDocument);
	}


}
