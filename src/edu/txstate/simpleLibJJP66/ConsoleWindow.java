package edu.txstate.simpleLibJJP66;

import java.util.Scanner;

public abstract class ConsoleWindow {

	protected static Scanner in = new Scanner (System.in);
	protected static Scanner search = new Scanner (System.in);
	protected static Scanner remove = new Scanner (System.in);
	protected static Scanner delete = new Scanner (System.in);
	protected static Scanner User = new Scanner (System.in);
	protected static Scanner inputForUser = new Scanner (System.in);
	
	protected abstract void printMenu();
	
}
