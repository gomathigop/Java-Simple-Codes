package com.edu;

import java.util.Scanner;

public class Bankpgm {
	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter sum: ");
    double sum = sc.nextDouble();
    
    System.out.print("Enter age: ");
    int age = sc.nextInt();
    
    System.out.print("Enter term: ");
    double term = sc.nextDouble();
    
    double si = 0.0;
    
    if (term <= 1 && age < 60)
        si = (sum * 7.5 * term) / 100;
    else if (term <= 1 && age >= 60)
        si = (sum * 8.0 * term) / 100;
   
    else if (term <= 2 && age < 60)
        si = (sum * 8.5 * term) / 100;
    else if (term <= 2 && age >= 60)
        si = (sum * 9.0 * term) / 100;
    
    else if (term <= 3 && age < 60)
        si = (sum * 9.5 * term) / 100;
    else if (term <= 3 && age >= 60)
        si = (sum * 10.0 * term) / 100;
    else if (term > 3 && age < 60)
        si = (sum * 10.0 * term) / 100;
    else if (term > 3 && age >= 60)
        si = (sum * 11.0 * term) / 100;
        
    double amt = sum + si;
    
    System.out.println("Amount Deposited: " +  sum);
    System.out.println("Term: " +  term);
    System.out.println("Age: " +  age);
    System.out.println("Interest Earned: " +  si);
    System.out.println("Amount Paid: " +  amt);
}
}


