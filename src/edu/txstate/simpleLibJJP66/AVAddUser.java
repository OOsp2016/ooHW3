package edu.txstate.simpleLibJJP66;

import java.util.InputMismatchException;

public class AVAddUser extends ConsoleWindow{
	public void printMenu() {
		System.out.println(
		"\nEnter 1 to add a new student" 
		+ "\nEnter 2 to add a new faculty member" 
		+ "\nEnter 3 to add new staff member"
		+ "\nEnter 4 to exit.");
	}
	
	public void aVAUMenuChoice() {
		boolean running = true;	
		while (running) {
			// Call add user menu method to display options
			printMenu();
			try {
				int answer = in.nextInt();
				
				switch (answer) {
					case 1:
						// Add student
						System.out.println("\nReady to add student.");
						addStudent();
						break;
					case 2:
						// Add faculty
						System.out.println("\nReady to add faculty.");
						addFaculty();
						break;
					case 3:
						// Add staff
						System.out.println("\nReady to add staff.");
						addStaff();
						break;
					case 4:
						System.out.println("\nExiting add user menu...");
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
		System.out.println("\nEntered addStudent()");
	}
	
	public static void addFaculty() {
		// Add new faculty
		System.out.println("\nEntered addFaculty()");
	}
	
	public static void addStaff() {
		// Add new staff
		System.out.println("\nEntered addStaff()");
	}
}
