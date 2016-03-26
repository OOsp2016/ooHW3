package edu.txstate.simpleLibJJP66;

import java.util.InputMismatchException;

public class AVAddUser extends AdminView{
	public static void AVAUMenu() {
		System.out.println(
		"\nEnter 1 to add a new student" 
		+ "\nEnter 2 to add a new faculty member" 
		+ "\nEnter 3 to add new staff member"
		+ "\nEnter 4 to exit.");
	}
	
	public static void AVAUMenuChoice() {
		boolean running = true;	
		while (running) {
			//call AVAUMenu function to display options
			AVAUMenu();
			try {
				int answer = in.nextInt();
				
				switch (answer) {
					case 1:
						// Add student
						break;
					case 2:
						// Add faculty
						break;
					case 3:
						// Add staff
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
	
	public static void addStudent() {
		// Add new student
	}
	
	public static void addFaculty() {
		// Add new faculty
	}
	
	public static void addStaff() {
		// Add new staff
	}
}
