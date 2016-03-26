package edu.txstate.simpleLibJJP66;

import java.util.InputMismatchException;

public class AVListData extends AdminView{
	public static void AVLDMenu() {
		System.out.println(
		"\nEnter 1 to list books" 
		+ "\nEnter 2 to list journals" 
		+ "\nEnter 3 to list students"
		+ "\nEnter 4 to list faculty"
		+ "\nEnter 5 to list staff"
		+ "\nEnter 6 to exit.");
	}
	
	public static void AVLDMenuChoice() {
		boolean running = true;	
		while (running) {
			//call AVLDMenu function to display options
			AVLDMenu();
			try {
				int answer = in.nextInt();
				
				switch (answer) {
					case 1:
						// List books
						break;
					case 2:
						// List journals
						break;
					case 3:
						// List Students
						break;
					case 4:
						// List Faculty
						break;
					case 5:
						// List Staff
						break;
					case 6:
						running = false;
						break;
					default:
						System.err.println("Please select a number between 1 and 6.");
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
	
	public static void listBooks() {
		// List books
	}
	
	public static void listJournals() {
		// List journals
	}
	
	public static void listStudents() {
		// List students
	}
	
	public static void listFaculty() {
		// List faculty
	}
	
	public static void listStaff() {
		// List staff
	}
}
