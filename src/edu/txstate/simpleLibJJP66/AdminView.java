package edu.txstate.simpleLibJJP66;

import java.util.InputMismatchException;

public class AdminView extends FrontEnd {
	public static void AVMenu() {
		System.out.println(
				"\nEnter 1 to add users" 
				+ "\nEnter 2 to remove users" 
				+ "\nEnter 3 to list data" 
				+ "\nEnter 4 to exit.");
	}
	
	public static void AVMenuChoice() {
		boolean running = true;
		while (running) {
			//call AVMenu function to display options
			AVMenu();
			try {
				int answer = in.nextInt();
				
				switch (answer) {
					case 1:
						// Add users
						break;
				
					case 2:
						// Remove users
						break;
					
					case 3:
						// List data
						break;
					
					case 4:
						// Exit (move back one step in hierarchy)
						running = false;
						break;
					
					default:
						System.err.println("Please select a number between 1 and 4.");
				}
			} catch (InputMismatchException ex) {
				System.err.println("Input missmatch. Please try again." + ex);
				in.nextLine(); // Clear the new line character from the input
			} catch (UnsupportedOperationException ex) {
				ex.printStackTrace(); // For debugging purposes only.
			} catch (Exception ex) {
				System.err.println("An unknown error has occurred." + ex);
			}		
		}
	}
}

