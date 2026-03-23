
public class Main {

	public static void main(String[] args) {
		
		//1. Write a program that checks if a person’s age is greater than 18, then print "Adult".
		{
			int age = 20;
			if(age > 18) {
				System.out.println("Adult");
			}
		}
		
		
		//2. Write a program to check whether a number is divisible by 10.
		{
			int number = 12335430;
			if(number % 10 == 0) {
				System.out.println("This Number can be Divisible by 10");
			}
		}
		
		
		//3. Write a program to check whether a temperature is above 30°C, then print "Hot Day".
		{
			int tempreture = 50;
			if(tempreture > 30 ) {
				System.out.println("Hot Day");
			}
		}
		
		
		//4. Write a program to check whether a number is even or odd.
		{
			int num = 32;
			if(num % 2 == 0) {
				System.out.println("Even Number");
			}
			else {
				System.out.println("Odd Number");
			}
		}
		
		
		//5. Write a program to check whether a given year is leap year or not.
		{
			int year = 2004;
			if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			    System.out.println("Leap Year");
			} else {
			    System.out.println("Not a Leap Year");
			}
		}
		
		//6. Write a program to check whether a number is positive or negative.
		{
			int number = 1232;
			
			if(number >= 0) {
				System.out.println("Positive Number");
			}
			else if(number < 0) {
				System.out.println("Negative Number");
			}
			
		}
		
		/*7.  Write a program to find grade of a student based  on marks:
		90–100 → Grade A
		75–89 → Grade B
		50–74 → Grade C
		35–49 → Grade D
		Below 35 → Fail */
		{
			
			int marks = 67;
			
			if(marks >=90 && marks <= 100) {
				System.out.println("Grade A");
			}
			else if(marks >= 75 && marks <= 100) {
				System.out.println("Grade B");
			}
			else if(marks >= 50 && marks <= 100) {
				System.out.println("Grade C");
			}
			else if(marks >= 35 && marks <= 100) {
				System.out.println("Grade D");
			}
			else {
				System.out.println("Failed");
			}
			
		}
		
		
		//8. Write a program to print the day of the week based on day number (1–7).
		{
			int day = 5;

			if(day == 1) {
			    System.out.println("Monday");
			}
			else if(day == 2) {
			    System.out.println("Tuesday");
			}
			else if(day == 3) {
			    System.out.println("Wednesday");
			}
			else if(day == 4) {
			    System.out.println("Thursday");
			}
			else if(day == 5) {
			    System.out.println("Friday");
			}
			else if(day == 6) {
			    System.out.println("Saturday");
			}
			else if(day == 7) {
			    System.out.println("Sunday");
			}
			else {
			    System.out.println("Invalid day");
			}
		}
		
		
		//9. Write a program to check the type of triangle (Equilateral, Isosceles, or Scalene).
		{
			int side1 = 20;
			int side2 = 60;
			int side3 = 20;
			
			if((side1 == side2) && (side2== side3) ) {
				System.out.println("Equilateral Triangle");
			}
			else if((side1 == side2) || (side2== side3) || (side1 == side3)  ) {
				System.out.println("Isosceles Triangle");
			}
			else {
				System.out.println("Scalene Triangle");
			}
		}
		
		
		/*10. Write a program to print a message based on age group:
              0–12 → Child
             13–19 → Teenager
             20–59 → Adult
             60+ → Senior Citizen */
		{
			int age = 25;

	        if(age >= 0 && age <= 12) {
	            System.out.println("Child");
	        }
	        else if(age >= 13 && age <= 19) {
	            System.out.println("Teenager");
	        }
	        else if(age >= 20 && age <= 59) {
	            System.out.println("Adult");
	        }
	        else if(age >= 60) {
	            System.out.println("Senior Citizen");
	        }
	        else {
	            System.out.println("Invalid Age");
	        }
		}
		
		
		
		//11. Write a program to classify a temperature as Hot, Warm, Cool, or Cold.
		{
			
			int tempreture = 27;
			
			 if (tempreture >= 35) {
		            System.out.println("Hot");
		        }
		        else if (tempreture >= 25) {
		            System.out.println("Warm");
		        }
		        else if (tempreture >= 15) {
		            System.out.println("Cool");
		        }
		        else {
		            System.out.println("Cold");
		        }
		}
		
		
		//12. Write a program to check whether a number is positive, negative, or zero.
		{
			int number = 0;
			
			if(number > 0) {
				System.out.println("Number is positive");
			}
			else if(number < 0) {
				System.out.println("Number is negative");
			}
			else {
				System.out.println("Number is zero");
			}
		}
		
		//13. Write a program to check if a person is eligible to vote, and if eligible, check if they can contest in elections (age ≥ 25).
		int age = 22;
		
		if(age >= 18) {
			System.out.print("Person is eligible for vote ");
			
			if(age >= 25) {
				System.out.println("and he can contest in elections ");
			}
			else {
				System.out.println("but he can't contest in elections ");
			}
		}
		else {
			System.out.print("Person is not eligible for vote ");
		}
		
		
		//14. Write a program to check if a year is leap year, and if leap, check if it’s a century year.
		{
			int year = 2004;
			if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			    System.out.print("Leap Year ");
			    
			    if(year % 100 == 0) {
			    	System.out.println("As Well As century year");
			    }
			    else {
			    	System.out.println("but not a century year");
			    }
			    	
			    
			} else {
			    System.out.println("Not a Leap Year");
			}
		}
		
		
		//Write a program to check whether a number is even, and if even, check whether it’s greater than 50.
		{
			int number = 79;
			
			if(number%2 == 0) {
				System.out.print("This is even number ");
				
				if(number > 50) {
					System.out.println("and greater than 50 ");
				}
				else {
					System.out.println("but not greater than 50  ");
				}
			}
			else {
				System.out.print("This is odd number");
			}
			
		}
	}
}
