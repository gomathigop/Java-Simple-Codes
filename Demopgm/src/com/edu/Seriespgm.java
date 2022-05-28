package com.edu;

import java.util.Scanner;

public class Seriespgm {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of terms to sum: ");
		int n=sc.nextInt();
		System.out.println("Enter value of a: ");
		int a= sc.nextInt();
		int sum=0;
		
		for (int i=1;i<=n;i++) {
			sum+=Math.pow(a, i);
		}
		System.out.println("Sum of series 1 is: "+sum);
		sum=0;
		for(int i=1;i<=n;i++) {
			sum=a+i;
		}
		System.out.println("Sum of series 2 is: "+sum);
	}

}


