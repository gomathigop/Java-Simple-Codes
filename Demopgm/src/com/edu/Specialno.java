package com.edu;

import java.util.Scanner;

public class Specialno {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n,num=0,a=0,s=0,p=1;
		System.out.println("Enter the two digit number");
		n=in.nextInt();
		num=n;
		while(n!=0)
		{
			a=n%10;
			s=s+a;
			p=p*a;
			n=n/10;
		}
		if((s+p)==num)
			System.out.println(num + " is a special two digit number");
		else
			System.out.println(num + " is not a special two digit number");
	}
}


