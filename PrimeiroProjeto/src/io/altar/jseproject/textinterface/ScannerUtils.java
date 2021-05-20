package io.altar.jseproject.textinterface;

import java.util.Scanner;

public class ScannerUtils {
	private Scanner scan = new Scanner(System.in);

	public int getInt(int min, int max) {
		int userInput = getInt();
		if (min <= userInput && max >= userInput) {
			return userInput;
		} else {
			System.out.println("invalid number range:" + min + "-" + max);
			return getInt(min, max);
		}
	}

	public int getInt() {
		do {
			if (scan.hasNextInt()) {
				return scan.nextInt();
			} else {
				scan.nextLine();
			}
		} while (true);
	}

	public int getInRange(int min, int max) {
		do { 
			int value = getInt ();
			if (value >= min && value <= max) {
				return value; 
			}
		} while (true);
		
	}
			
		
	
}
