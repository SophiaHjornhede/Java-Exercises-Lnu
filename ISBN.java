package sh224aw_assign1.src;

import java.util.Scanner;

public class ISBN {
	
	public static void main (String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int n, d1, d2, d3, d4, d5, d6, d7, d8, d9, d10;
				
		System.out.println("Enter the first 9 digits of an ISBN as integer: ");
		
		n = s.nextInt();	
		
		d1 = n/100000000%10;
		d2 = n/10000000%10;
		d3 = n/1000000%10;
		d4 = n/100000%10;
		d5 = n/10000%10;
		d6 = n/1000%10;
		d7 = n/100%10;
		d8 = n/10%10;
		d9 = n%10;
		
		d10 = (d1*1 + d2*2 + d3*3 + d4*4 + d5*5 + d6*6 + d7*7 + d8*8 + d9*9)%11;
		
		if(d10<10) {
			
			System.out.println("The ISBN-10 number is: " + n + d10);
			
		}			
		else {
			
			System.out.println("The ISBN-10 number is: " + n + "X");
		}		
		
	}
}
