package edu.txstate.simpleLibJJP66;

import java.util.InputMismatchException;

public class LibrarianView extends ViewMenu{
	public static void lVMenu(){
		System.out.println(
				"\nEnter 1 to add new documents."
				+ "\nEnter 2 view checked out documents."
				+ "\nEnter 3 to exit.");
	}
	
	public static void lVMenuChoice(){
		boolean running = true;
		while (running) {
			//Displays the librarian view menu
			lVMenu();
			try {
				int answer = in.nextInt();

				switch (answer) {

				case 1:
					// add documents
					LVAddDocument.lVADMenuChoice();
					break;
				case 2:
					// Prints transaction list
					System.out.println("\nPrinting out transaction list.");
					//System.out.println(Backend.trans.toString());
					break;
				case 3:
					// Exit
					System.out.println("\nExiting librarian view...");
					running = false;
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
}
