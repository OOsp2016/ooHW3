package edu.txstate.simpleLibJJP66;

import java.util.InputMismatchException;

public class AVRemoveUser extends AdminView{
	public static void AVRUMenu() {
		System.out.println(
		"\nEnter 1 to add a new student" 
		+ "\nEnter 2 to add a new faculty member" 
		+ "\nEnter 3 to add new staff member"
		+ "\nEnter 4 to exit.");
	}
	
	public static void AVAUMenuChoice() {
		boolean running = true;	
		while (running) {
			//call AVRUMenu function to display options
			AVRUMenu();
			try {
				int answer = in.nextInt();
				
				switch (answer) {
					case 1:
						// Remove student
						break;
					case 2:
						// Remove faculty
						break;
					case 3:
						// Remove staff
						break;
					case 4:
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
	
	public static void RemoveStudent() {
		// Remove new student
	}
	
	public static void RemoveFaculty() {
		// Remove new faculty
	}
	
	public static void RemoveStaff() {
		// Remove new staff
	}
}
