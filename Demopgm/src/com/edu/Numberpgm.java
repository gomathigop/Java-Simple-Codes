package com.edu;

import java.util.Scanner;

public class Numberpgm {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int a = in.nextInt();
		System.out.print("Enter second number: ");
		int b = in.nextInt();
		System.out.print("Enter third number: ");
		int c = in.nextInt();
		int greatestNumber = a;
		if ((a == b) && (b == c)) {
			System.out.println("Entered numbers are equal.");
		}
		else {
			if (b > greatestNumber) {
				greatestNumber = b;
			}
			if (c > greatestNumber) {
				greatestNumber = c;
				System.out.println("The greatest number is " + greatestNumber);
				if ((a >= 0) && (b >= 0) && (c >= 0)) {
					System.out.println("Entered numbers are all Positive numbers.");
				}
				else if((a < 0) && (b < 0) && (c < 0)) {
					System.out.println("Entered numbers are all Negative numbers.");
				}
				else {
					System.out.println("Entered numbers are Mixed numbers.");
				}
			}
		}
	}
}






