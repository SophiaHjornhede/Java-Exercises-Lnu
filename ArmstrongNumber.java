package sh224aw_assign1.src;


import java.util.Scanner;

public class ArmstrongNumber {
	

	public static void main(String[] args) {		
		
		numbers();
		
	}
			
	 
	   
		
	public static void numbers() {
		
		Scanner s = new Scanner(System.in);	 	
	    
	    System.out.print("Enter the starting number of the range: ");

	    int start = s.nextInt();
	 				
					
	    System.out.print("Enter the ending number of the range: ");

	    int end = s.nextInt();
	    
	        System.out.println("The Armstrong numbers between the given range are: ") ; 
	        
	        for (int i = start; i < end; i++) {

	        if (checkForArmstrong(i)) {
	
		        System.out.println(i);       

		    }   	
		    
        }		
	
	    
	  System.out.print("Do you want to repeat(Y/N): ");		
	  
	      char repeat = s.next().charAt(0);	 
	      
	          if(repeat == 'Y') {
	        	  
	        	  numbers();
	        	  
	          }else if (repeat == 'y') {
	        	  
	        	  numbers();
	        	  
	          }else {
	        	  
	        	  System.out.println("Good bye ");
	        	  
	          }

}
	
	private static boolean checkForArmstrong(int num) {
		
		
	    String length = String.valueOf(num);
	    
	    int n = length.length();
	    
	    int temp = num;
	    
	    double sumtemp = 0.00;
	    
	    for(int j=n; j>0; j--) {
	    	
	    	double a = Math.pow(temp%10, n); //last digit powers n
	    	
	    	temp = temp/10;
	    	
	    	sumtemp += a;
	    	
	    }
	    
	    int sum = (int) sumtemp;    
    
	    	
	    if(sum == num) {
	    	
	    	return true;	    	
	    } 
	    
		return false;
	}
	
}

