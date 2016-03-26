package edu.txstate.simpleLibJJP66;

import java.util.InputMismatchException;

public class UserView extends FrontEnd {

	public static void UVMenu() {
		System.out
				.println("\nEnter 1 to Search" + "\nEnter 2 to Borrow" + "\nEnter 3 to Return" + "\nEnter 4 to exit.");
	}

	public static void UVMenuChoice() {
		boolean running = true;
		while (running) {
			//call UVMenu function to display options
			UVMenu();
			try {
				int answer = in.nextInt();

				switch (answer) {

				case 1:
					// has Backend search lists
					break;
				case 2:
					// brings you to the borrow menu
					break;
				case 3:
					// return item menu
					break;
				case 4:
					// exits
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
