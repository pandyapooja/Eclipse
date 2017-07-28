package main;

import java.util.Scanner;

public class MathOperator {
	public static void main (String args[]) {
		Scanner bucky = new Scanner(System.in);
		
		int g, b, people;
		g = bucky.nextInt();
		b = bucky.nextInt();
		people = g%b;
		System.out.println(people);
		
		bucky.close();
		}
}
