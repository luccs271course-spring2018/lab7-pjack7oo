package edu.luc.cs271.linkedstack;

import java.util.Scanner;


public class ReverseLines {
	public static String temp2;
	public static String temp = "";
	public static void main(final String[] args) {
		final Scanner input = new Scanner(System.in);
		printReverse(input);
	}

	private static void printReverse(final Scanner input) {
		// TODO recursively read and print successive input lines until EOF, then print them out in reverse order

		if(input.hasNext()) {

			temp2 = input.nextLine();
			temp +=temp2 + "\n";
			System.out.println(temp2);
			printReverse(input);
		}
		else {
			System.out.println(temp);
			return;
		}
	}
}
