package edu.txstate.simpleLibJJP66;

import java.util.InputMismatchException;

public class LVAddDocument extends LibrarianView{
	public static void lVADMenu() {
		System.out.println(
				"\nEnter 1 to add a new book" 
				+ "\nEnter 2 to add a new journal" 
				+ "\nEnter 3 to exit.");
	}
	
	public static void lVADMenuChoice() {
		boolean running = true;	
		while (running) {
			// Call lvAdMenu method to display options
			lVADMenu();
			try {
				int answer = in.nextInt();
				
				switch (answer) {
					case 1:
						// Add new book
						System.out.println("\nReady to add new book.");
						addBook();
						break;
					case 2:
						// Add new journal
						System.out.println("\nReady to add new journal.");
						addJournal();
						break;
					case 3:
						System.out.println("\nExiting librarian view...");
						running = false;
						break;
					default:
						System.err.println("Please select a number between 1 and 3.");
				}
			} catch (InputMismatchException ex) {
				System.err.println("Input missmatch. Please Try again." + ex);
				in.nextLine(); // clear the new line character from the input
			} catch (UnsupportedOperationException ex) {
				ex.printStackTrace(); // For debugging purposes only.
			} catch (Exception ex) {
				System.err.println("An unknown error has occured." + ex);
			}
		}
	}
	
	public static void addBook() {
		// Add book
		System.out.println("\nEntered addBook()");
	}
	
	public static void addJournal() {
		// Add journal
		System.out.println("\nEntered addJournal()");
	}
}
