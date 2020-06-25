/**
 * 
 */
package sh224aw_assign1.src;

import java.util.Scanner;

public class Numbers {
	
   public static void main(String[] args) {
	   
	   Scanner s = new Scanner(System.in);
	   
	   int number, a, b, c;
	   int sum = 0;
	   int product = 1;	   
	   
	   System.out.println("Enter a three-digit integer number: ");
	   
	   number = s.nextInt();	  
	  
	   a = number/100%10;
	   b = number/10%10;		   
	   c = number%10;	   
	   
	   sum = a+b+c;
	   product = a*b*c;  	   	   
	   
	   System.out.println("Sum of the digits of the integer number is: " + sum);
	   System.out.println("Product of the digits of the integer number is: " + product);
	   
   }

}
