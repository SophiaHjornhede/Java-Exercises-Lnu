package sh224aw_assign1.src;

import java.util.Scanner;

public class Days {


	public static void main (String[] args) {
		
		String weekday[] = new String[7];	
						
		weekday[0] = "Sunday";
		weekday[1] = "Monday";
		weekday[2] = "Tuesday";
		weekday[3] = "Wednesday";
		weekday[4] = "Thursday";
		weekday[5] = "Friday";
		weekday[6] = "Saturday";		
		
		Scanner s = new Scanner(System.in);
		
		int day, fDay;
		
		System.out.println("Enter today's day: ");
				
		day = s.nextInt();	
		
		
		if(day>=0 && day<=6) {
			
			System.out.println("Enter the number for the future day: ");
			
			fDay = s.nextInt();		
			
			int count = (fDay - day)%7 + 1;	
						
			switch (count) {
			
			case 1: 
				
				System.out.println("Today is " + weekday[day] + " and the future day is Sunday");
				
				break;
				
            case 2: 
				
				System.out.println("Today is " + weekday[day] + " and the future day is Monday");
				
				break;
				
            case 3: 
	
	            System.out.println("Today is " + weekday[day]  + " and the future day is Tuesday");
	
	            break;
	            
            case 4: 
				
				System.out.println("Today is " + weekday[day] + " and the future day is Wednesday");
				
				break;
				
            case 5: 
				
				System.out.println("Today is " + weekday[day]  + " and the future day is Thursday");
				
				break;
				
            case 6: 
	
	            System.out.println("Today is " + weekday[day]  + " and the future day is Friday");
	
	            break;
	            
            case 7: 
            	
	            System.out.println("Today is " + weekday[day]  + " and the future day is Saturday");
	
	            break;
			
			}
			
					
		} else {
			
			System.out.println("Wrong number, game over.");
			
		}
			
	}
	
}
