package edu.txstate.simpleLibJJP66;

import java.util.InputMismatchException;

public class LVAddDocument extends LibrarianView{
	public static void LVADMenu() {
		System.out.println(
				"\nEnter 1 to add a new book" 
				+ "\nEnter 2 to add a new journal" 
				+ "\nEnter 3 to exit.");
	}
	
	public static void LVADMenuChoice() {
		boolean running = true;	
		while (running) {
			// Call LVADMenu function to display options
			LVADMenu();
			try {
				int answer = in.nextInt();
				
				switch (answer) {
					case 1:
						// Add new book
						break;
					case 2:
						// Add new journal
						break;
					case 3:
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
	}
	
	public static void addJournal() {
		// Add journal
	}
}
