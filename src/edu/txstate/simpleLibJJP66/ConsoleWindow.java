package edu.txstate.simpleLibJJP66;

import java.util.Scanner;

public abstract class ConsoleWindow {

	protected static Scanner in = new Scanner (System.in);
	
	protected abstract void printMenu();
	
}
