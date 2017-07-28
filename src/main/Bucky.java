package main;

import java.util.Scanner;

class Bucky {
	public static void main (String args[]) {	
		Scanner bucky = new Scanner (System.in);
		double fnum, snum, ans;
		System.out.println("Enter first num: ");
		fnum = bucky.nextDouble();
		
		System.out.println("Enter second num:");
		snum = bucky.nextDouble();
		
		
		ans = fnum + snum;
		System.out.println(ans);
		
		
		System.out.println(bucky.nextLine());
	}
}