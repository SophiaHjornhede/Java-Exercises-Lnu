package sh224aw_assign1.src;

import java.util.Scanner;

public class SquareRoot {
	
	public static void main (String[] args) {
		
		System.out.println("This program estimate square roots, ");
		System.out.println("Enter an integer to estimate the square root of: ");
		
		Scanner c = new Scanner(System.in);
		
		int n = c.nextInt();
		
		double g = n/2;
		double r = 0;		
		
		System.out.println("Current guess: " + g);		
		
		while(Math.abs(g-r)>=0.01) {
			
		    r = n/g;
			
			System.out.println("Current guess: " + r);
			
			g = (g+r)/2;
			
			System.out.println("Current guess: " + g);
			
		}		
	
		
		System.out.println("The estimated square root of " + n + " is " + String.format("%.3g", g));
	
		
	}


}
