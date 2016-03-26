package edu.txstate.simpleLibJJP66;

import java.util.InputMismatchException;

public class UVSearch extends UserView{

	public static void uvSearchMenu(){
		System.out.println(
				"\nEnter 1 to search books."
				+ "\nEnter 2 to search journals."
				+ "\nEnter 3 to exit.");
	}
	
	public static void uvSearchMenuChoice() {
		Boolean searching = true;
		// while loop for menu
		while (searching) {
			uvSearchMenu();
			try {
				int answer = in.nextInt();

				switch (answer) {
				
				case 1:
					// Searches for a book
					searchBooks();
					break;
				case 2:
					// searches for a journal
					searchJournals();
					break;
				case 3:
					searching = false;
					break;
				default:
					System.err
							.println("Please select a number between 1 and 3.");
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


	private static void searchBooks() {
		String input = "nothing";
		System.out.println("\nEnter Title or Author to search for: ");
		input = in.nextLine();
		//lib.searchBooks(input);
	}	
	

	private static void searchJournals() {
		String input = "nothing";

		System.out.println("\nEnter Title to search for: ");
		input = in.nextLine();
		//jour.searchJournals(input);
	}

}