package edu.txstate.simpleLibJJP66;

/**
 * 
 * @author Julius Jesus Perez
 * @author Keith Andrew Baize
 *
 *This program compiles and runs successfully.
 *No errors have been found by the developers thus far.
 */

public class Main {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/* The following commented out code block starts the tests developed
		 * to determine if the classes were working properly. 
		System.out.println("Testing Books");
		TestBooks.StartTests();
		System.out.println("Testing Journals");
		TestJournals.StartTests();
		*/
		
		// Execute library system front-end.
		ViewMenu menu;
		menu = new ViewMenu();
		menu.start();
		
	}

}
