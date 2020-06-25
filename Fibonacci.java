package sh224aw_assign1.src;


public class Fibonacci {
	
	public static void main(String[] args) {
		
	int fb[] = new int[1000];
	
	fb[0] = 1;
	fb[1] = 2;
	
	int sum = 1;
	
	System.out.print("The Fibonacci sequence between 1 and 1000 are: 1 2 ");
	
	for (int i=2;i<1000;i++) {
		
		fb[i]=fb[i-1]+fb[i-2];
		
		if(fb[i]>=1000) {
			
			break;
		}		
		
		
		if(fb[i]%2 == 1) {
			
		   sum += fb[i];
			
		}
		
		System.out.print(fb[i] + " ");
		
	}

	System.out.print(" \n");

	System.out.println("The sum of the odd-valued terms in the Fibonacci sequence are: " + sum);
		
		
	}
	
}
