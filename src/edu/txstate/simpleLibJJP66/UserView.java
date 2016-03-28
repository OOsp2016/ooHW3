package edu.txstate.simpleLibJJP66;

import java.util.InputMismatchException;

public class UserView extends ConsoleWindow {

	public void printMenu() {
		System.out.println(
				"\nEnter 1 to search." 
				+ "\nEnter 2 to borrow document." 
				+ "\nEnter 3 to return document." 
				+ "\nEnter 4 to exit.");
	}

	public void uVMenuChoice() {
		UVSearch UVS = new UVSearch();
		UVBorrow UVB = new UVBorrow();
		UVReturn UVR = new UVReturn();
		
		
		boolean running = true;
		while (running) {
			//call UVMenu function to display options
			printMenu();
			try {
				int answer = in.nextInt();

				switch (answer) {
				case 1:
					// Goes to User View Search Menu
					UVS.uVSearchMenuChoice();
					break;
				case 2:
					// brings you to the borrow menu
					UVB.uVBorrowMenuChoice();
					break;
				case 3:
					// return item menu
					UVR.uVReturnMenuChoice();
					break;
				case 4:
					// exits
					System.out.println("\nExiting user view menu...");
					running = false;
					break;
				default:
					System.err.println("Please select a number between 1 and 4.");
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
