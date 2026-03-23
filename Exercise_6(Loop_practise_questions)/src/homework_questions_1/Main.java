package homework_questions_1;
import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//1] Reverse Number
		{
			System.out.print("\nEnter Number which you want to reverse =>");
			int num = sc.nextInt();
			int ans = 0;
			
			while(num > 0) {
				
				int temp = num % 10;
				num = num/10;
				
				ans = (ans * 10) + temp;
				
			}
			
			
			System.out.println(ans);
			
		}
		
		
		//2] palidrome 
		{
			System.out.print("\nEnter a String to Check if it is palidrome or not =>");
			String value = sc.next();
			
			int i =0;
			int j = value.length() - 1;
			boolean ispalidrome = true;
			
			while(i<j) {
				if(value.charAt(i) != value.charAt(j)) {
					ispalidrome = false;
				}
				
				i++;
				j--;
			}
			
			if(ispalidrome)
			System.out.println("This is a palidrome");
			
			else
			System.out.println("This is not a palidrome");
		}
		
		
		//3] Prime Number
		{
			System.out.print("\nPrime Numbers upto range=> ");
			int number = sc.nextInt();
			boolean isPrimeNo = true;
			
			
			for(int i=2; i<=number; i++) {
				
				for(int j = 2; j<=(i/2); j++) {
					
					if(i%j == 0) {
						isPrimeNo = false;
						break;
					}
				}
				
				if(isPrimeNo) {
					System.out.print(i + " ");
				}
				
				isPrimeNo = true;
			}
		}
		
		
		
	}
	
}
