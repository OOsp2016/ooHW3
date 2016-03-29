package edu.txstate.simpleLibJJP66;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Data {

	static Scanner DataInput = new Scanner(System.in);
	static Scanner DataInput2 = new Scanner(System.in);


	static BookCollection ListOfBooks = new BookCollection();
	static JournalCollection ListOfJournals = new JournalCollection();
	static StudentCollection ListOfStudents = new StudentCollection();
	static FacultyCollection ListOfFaculty = new FacultyCollection();
	static TransactionCollection ListOfTransactions = new TransactionCollection();

	public static void LoadData() {
		// This method constructs a set of objects to use if a file does not
		// currently exist
		FileInputStream FIS = null;
		ObjectInputStream OIS = null;

		// This is the data file that contains the objects
		File DataFile = new File("Data" + ".ser");

		// if statement to determine existence
		if (DataFile.exists()) {
			try {
				FIS = new FileInputStream(DataFile);
				OIS = new ObjectInputStream(FIS);

				ListOfBooks = (BookCollection) OIS.readObject();
				ListOfJournals = (JournalCollection) OIS.readObject();
				ListOfStudents = (StudentCollection) OIS.readObject();
				ListOfFaculty = (FacultyCollection) OIS.readObject();
				ListOfTransactions = (TransactionCollection) OIS.readObject();

				FIS.close();
				OIS.close();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}

		} else {
			System.out.println("\nNo DataFile detected, Sample objects will be created.");
			CreateSampleObjects();
		}
		// End LoadData
	}

	static void CreateSampleObjects() {

		// Make Book objects and add them to ListOfBooks
		Book FirstBook = new Book("Factotum", "HarperCollins Publishers", "5/28/2002", "9780876852637", 20, "Charles Bukowski");
		ListOfBooks.addBook(FirstBook);
		Book SecondBook = new Book("Catcher in the Rye", "Litte, Brown and Company", "5/01/1991", "0316769487", 20,
				"J. D. Salinger");
		ListOfBooks.addBook(SecondBook);
		Book ThirdBook = new Book("The Great Gatsby", "Scribner", "09/30/2004", "0743273567", 20, "F. Scott Fitzgerald");
		ListOfBooks.addBook(ThirdBook);
		Book ForthBook = new Book("Battle Royale", "VIZ Media LLC", "02/26/2003", "156931778X", 20, "Koushun Takami");
		ListOfBooks.addBook(ForthBook);
		Book FifthBook = new Book("Redwall", "Puffin/Philomel Book", "09/30/2002", "0142302376", 20, "Brian Jacques");
		ListOfBooks.addBook(FifthBook);
		// end making Book Objects

		// Make Journal objects and add them to ListOfJournals
		Journal FirstJournal = new Journal("Emerging Trends", "08/19/2014", 10, 11, "IEEE Computer", 20, "A1");
		ListOfJournals.addJournal(FirstJournal);
		Journal SecondJournal = new Journal("National Geographic", "05/24/1968", 1, 2, "Geographical.Inc", 20, "A1");
		ListOfJournals.addJournal(SecondJournal);
		Journal ThirdJournal = new Journal("Common Framework", "09/20/2012", 11, 12, "O'Reily", 20, "A1");
		ListOfJournals.addJournal(ThirdJournal);
		Journal FourthJournal = new Journal("Foundations in Machine Learning", "10/12/2014", 10, 5, "CACM", 20, "A1");
		ListOfJournals.addJournal(FourthJournal);
		Journal FifthJournal = new Journal("Molecular Systems Biology", "07/22/2010", 9, 14, "Springer", 20, "A1");
		ListOfJournals.addJournal(FifthJournal);
		// end making journal objects

		// Make Student objects and add them to list of students
		Student FirstStudent = new Student("Bill Gates", "10281655", 0);
		ListOfStudents.addStudent(FirstStudent);
		Student SecondStudent = new Student("Steve Jobs", "02241955", 0);
		ListOfStudents.addStudent(SecondStudent);
		Student ThirdStudent = new Student("Steve Wozniak", "08111950", 0);
		ListOfStudents.addStudent(ThirdStudent);
		Student ForthStudent = new Student("Larry Page", "03261973", 0);
		ListOfStudents.addStudent(ForthStudent);
		Student FifthStudent = new Student("Sergey Bring", "08211973", 0);
		ListOfStudents.addStudent(FifthStudent);
		// end making student objects

		// Make Faculty objects and add them to list of Faculty
		Faculty FirstFaculty = new Faculty("Carl Sagan", "11091934", 0);
		ListOfFaculty.addFaculty(FirstFaculty);
		Faculty SecondFaculty = new Faculty("Albert Einstein", "05141879", 0);
		ListOfFaculty.addFaculty(SecondFaculty);
		Faculty ThirdFaculty = new Faculty("Neil deGrasse Tyson", "10051958", 0);
		ListOfFaculty.addFaculty(ThirdFaculty);
		Faculty FourthFaculty = new Faculty("Michio Kaku", "01241947", 0);
		ListOfFaculty.addFaculty(FourthFaculty);
		Faculty FifthFaculty = new Faculty("Isaac Newton", "01041643", 0);
		ListOfFaculty.addFaculty(FifthFaculty);
		// end making faculty objects
	}

	public static void saveAndQuit() {
		// This method creates files of all the information used
		// when running.
		String fileName = "DataFile" + ".ser";
		FileOutputStream fos = null;
		ObjectOutputStream out = null;
		try {
			fos = new FileOutputStream(fileName);
			out = new ObjectOutputStream(fos);
			out.writeObject(ListOfBooks);
			out.writeObject(ListOfJournals);
			out.writeObject(ListOfStudents);
			out.writeObject(ListOfFaculty);
			out.writeObject(ListOfTransactions);

			fos.close();
			out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void addData() {
		Boolean adding = true;
		while (adding) {
			System.out.println("\nEnter 0 to finish adding data." + "\nEnter 1 to add a new book."
					+ "\nEnter 2 to add a new Journal." + "\nEnter 3 to add a new Student."
					+ "\nEnter 4 to add a new Faculty.");
			try {
				int answer = DataInput.nextInt();

				switch (answer) {
				case 0:
					adding = false;
					break;
				case 1:
					//addBook();
					break;
				case 2:
					//addJournal();
					break;
				case 3:
					//addStudent();
					break;
				case 4:
					//addFaculty();
					break;
				default:
					System.err.println("Please select a number between 0 and 4.");
				}
			} catch (InputMismatchException ex) {
				System.err.println("Input missmatch. Please Try again." + ex);
				DataInput.nextLine(); // clear the new line character from the
										// input
			} catch (UnsupportedOperationException ex) {
				ex.printStackTrace(); // For debugging purposes only.
			} catch (Exception ex) {
				System.err.println("An unknown error has occured." + ex);
			}
		}
	}



	
	public static void listData() {
		Boolean listing = true;
		while (listing) {
			System.out.println("\nEnter 0 to finish listing." + "\nEnter 1 to list books."
					+ "\nEnter 2 to list journals" + "\nEnter 3 to list students." + "\nEnter 4 to list faculty"
					+ "\nEnter 5 to list transactions");
			int answer = DataInput.nextInt();

			switch (answer) {
			case 0:
				listing = false;
				break;
			case 1:
				// prints out books
				System.out.println(ListOfBooks.listBookCollection());
				break;
			case 2:
				// prints list of journals
				System.out.println(ListOfJournals.listJournalCollection());
				break;
			case 3:
				// prints list of students
				System.out.println(ListOfStudents.toString());
				break;
			case 4:
				// prints list of faculty
				System.out.println(ListOfFaculty.toString());
				break;
			case 5:
				// prints list of transactions
				System.out.println(ListOfTransactions.toString());
			}
		}
	}

	public static void borrowItem(String currentUser, int userType) {
		// this method lets the user borrow an item
		String book = "";
		Boolean borrowing = true;
		// this while loop gives the user a menu for what to return
		while (borrowing) {
			System.out.println("\nEnter 0 to finish borrowing." + "\nEnter 1 to borrow a book."
					+ "\nEnter 2 to borrow a journal.");
			int answer = DataInput.nextInt();

			switch (answer) {
			case 0:
				// breaks loop and goes back to previous menu
				borrowing = false;
				break;
			case 1:
				// borrows a book for the user
				book = borrowBook();
				if (book != null) {
					// creates a transaction for the user
					Transaction t = new Transaction(currentUser, book);
					ListOfTransactions.addTransaction(t);
					if (userType == 0) {
						// adds a copy to the user
						ListOfStudents.update(currentUser);
					} else
						// adds a copy to the user for faculty
						ListOfFaculty.update(currentUser);
				}
				break;
			case 2:
				// same as above but for journal
				book = borrowJournal();
				if (book != null) {
					Transaction t = new Transaction(currentUser, book);
					ListOfTransactions.addTransaction(t);
					if (userType == 0) {
						ListOfStudents.update(currentUser);
					} else
						ListOfFaculty.update(currentUser);
				}
				break;
			}
		}

	}

	private static String borrowBook() {
		// allows the user to choose what book to borrow
		String borrow;
		String bookTransaction = null;
		while (bookTransaction == null) {
			System.out.println("\nEnter title of book to borrow: \n");
			borrow = DataInput.nextLine();
			bookTransaction = ListOfBooks.Borrow(borrow);
		}
		return bookTransaction;

	}

	private static String borrowJournal() {
		// allows the user to choose what journal to borrow
		String borrow;
		String bookTransaction = null;
		while (bookTransaction == null) {
			System.out.println("\nEnter title of journal to borrow: \n");
			borrow = DataInput.nextLine();
			bookTransaction = ListOfJournals.Borrow(borrow);
		}
		return bookTransaction;
	}

	public static void returnItem(String currentUser, int userType) {
		// This method returns an item.
		String book = "";
		Boolean returning = true;
		// while loop for return options
		while (returning) {
			System.out.println("\nEnter 0 to finish returning." + "\nEnter 1 to return a book."
					+ "\nEnter 2 to return a journal.");
			int answer = DataInput.nextInt();

			switch (answer) {
			case 0:
				returning = false;
				break;
			case 1:
				// returns book
				book = returnBook();
				if (book != null) {
					// if the book is found then the transaction is removed
					ListOfTransactions.removeTransaction(currentUser, book);
					if (userType == 0) {
						// updates the copies
						ListOfStudents.updateReturn(currentUser);
					} else
						// updates the copies
						ListOfFaculty.updateReturn(currentUser);
				}
				break;
			case 2:
				// same as above but for journal
				book = returnJournal();
				if (book != null) {
					ListOfTransactions.removeTransaction(currentUser, book);
					if (userType == 0) {
						ListOfStudents.updateReturn(currentUser);
					} else
						ListOfFaculty.updateReturn(currentUser);
				}
				break;
			}
		}

	}

	private static String returnBook() {
		// TODO Auto-generated method stub
		// this allows the user to choose what book to return
		String returnBook;
		String bookTransaction = null;
		while (bookTransaction == null) {
			System.out.println("\nEnter title of book to return: \n");
			returnBook = DataInput.nextLine();
			bookTransaction = ListOfBooks.returnBook(returnBook);
		}
		return bookTransaction;
	}

	private static String returnJournal() {
		// TODO Auto-generated method stub
		// this allows the user to choose what journal to return
		String returnJournal;
		String bookTransaction = null;
		while (bookTransaction == null) {
			System.out.println("\nEnter title of journal to return: \n");
			returnJournal = DataInput.nextLine();
			bookTransaction = ListOfJournals.returnJournal(returnJournal);
		}
		return bookTransaction;
	}

	// end class
}
