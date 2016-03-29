package edu.txstate.simpleLibJJP66;

import java.util.InputMismatchException;

public class AVAddUser extends ConsoleWindow{
	public void printMenu() {
		System.out.println(
		"\nEnter 1 to add a new student" 
		+ "\nEnter 2 to add a new faculty member" 
		+ "\nEnter 3 to exit.");
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
						System.out.println("\nExiting add user menu...");
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
	
	public static void addStudent() {
		// adds a student by info.
		String name, ID;
		int copies;

		System.out.println("\nEnter Name: ");
		name = DataInput.nextLine();

		System.out.println("\nEnter ID: ");
		ID = DataInput.nextLine();

		System.out.println("\nEnter Copies: ");
		copies = DataInput.nextInt();

		Student addingStudent = new Student(name, ID, copies);
		Data.ListOfStudents.addStudent(addingStudent);
	}

	public static void addFaculty() {
		// same as above method but for faculty
		String name, ID;
		int copies;

		System.out.println("\nEnter Name: ");
		name = DataInput2.nextLine();

		System.out.println("\nEnter ID: ");
		ID = DataInput2.nextLine();

		System.out.println("\nEnter Copies: ");
		copies = DataInput2.nextInt();

		Faculty addingFaculty = new Faculty(name, ID, copies);
		Data.ListOfFaculty.addFaculty(addingFaculty);
	}
}
