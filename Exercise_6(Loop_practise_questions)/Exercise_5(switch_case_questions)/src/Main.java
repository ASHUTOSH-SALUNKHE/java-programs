
public class Main {
	

		public static void main(String[] args) {
			
			//1. Check Character Case
			{
				char ch = 'A';
	
				if(Character.isUpperCase(ch)) {
					System.out.println("Uppercase");
				}
				else if(Character.isLowerCase(ch)) {
					System.out.println("Lowercase");
				}
				
			}
			
			
			//2. Check Weekday or Weekend
			{
				int day = 6;
				switch(day) {
				case 1: case 2: case 3: case 4: case 5:
					System.out.println("Weekday");
					break;
				case 6: case 7:
					System.out.println("Weekend");
					break;
				default:
					System.out.println("Invalid Day");
				}
			}
			
			
			//3. Check Arithmetic Operation Name
			{
				char op = '+' ;
				
				switch(op) {
				case '+':
					System.out.println("Addition");
					break;
				case '-':
					System.out.println("Subtraction");
					break;
				case '*':
					System.out.println("Multiplication");
					break;
				case '/':
					System.out.println("Division");
					break;
				default:
					System.out.println("Invalid Operation");
				}
			}
			
			
			//4. Fruit Price Menu
			{
				String fruit = "Apple";
				
				switch(fruit) {
				case "Apple":
					System.out.println("Selected Fruit: Apple | Price: ₹100");
					break;
				case "Mango":
					System.out.println("Selected Fruit: Mango | Price: ₹80");
					break;
				case "Banana":
					System.out.println("Selected Fruit: Banana | Price: ₹40");
					break;
				case "Orange":
					System.out.println("Selected Fruit: Orange | Price: ₹60");
					break;
				default:
					System.out.println("Invalid fruit selection");
			}
			}
			
			
			//5. Language Selection
			{
				String lang = "Marathi";
				
				switch(lang) {
				case "English":
					System.out.println("Hello");
					break;
				case "Hindi":
					System.out.println("Namaste");
					break;
				case "Marathi":
					System.out.println("Namaskar");
					break;
				default:
					System.out.println("Invalid Choice");
				}
			}
			
			
			//6. Student Result Status
			{
				char grade = 'A';
				switch(grade) {
				case 'A':
					System.out.println("Distinction");
					break;
				case 'B':
					System.out.println("First Class");
					break;
				case 'C':
					System.out.println("Second Class");
					break;
				case 'D':
					System.out.println("Pass");
					break;
				case 'F':
					System.out.println("Fail");
					break;
				default:
					System.out.println("Invalid Grade");
				}
			}
			
			
			//7. Season Based on Month
			{
				int month = 7;
				switch(month) {
				case 12: case 1: case 2:
					System.out.println("Winter");
					break;
				case 3: case 4: case 5:
					System.out.println("Summer");
					break;
				case 6: case 7: case 8: case 9:
					System.out.println("Monsoon");
					break;
				case 10: case 11:
					System.out.println("Autumn");
					break;
				default:
					System.out.println("Invalid Month");
				}
			}
			
			
			//8. ATM Menu
			{
				int choice = 2;
				switch(choice) {
				case 1:
					System.out.println("Check Balance");
					break;
				case 2:
					System.out.println("Withdraw Money");
					break;
				case 3:
					System.out.println("Deposit Money");
					break;
				case 4:
					System.out.println("Exit");
					break;
				default:
					System.out.println("Invalid Choice");
				}
			}
			
			
			//9. Simple Food Menu
			{
				int food = 1;
				switch(food) {
				case 1:
					System.out.println("Pizza");
					break;
				case 2:
					System.out.println("Burger");
					break;
				case 3:
					System.out.println("Sandwich");
					break;
				case 4:
					System.out.println("Pasta");
					break;
				default:
					System.out.println("Invalid Choice");
				}
			}
			
			
			//10. Check Digit Name
			{
				int digit = 5;
				switch(digit) {
				case 0: System.out.println("Zero"); break;
				case 1: System.out.println("One"); break;
				case 2: System.out.println("Two"); break;
				case 3: System.out.println("Three"); break;
				case 4: System.out.println("Four"); break;
				case 5: System.out.println("Five"); break;
				case 6: System.out.println("Six"); break;
				case 7: System.out.println("Seven"); break;
				case 8: System.out.println("Eight"); break;
				case 9: System.out.println("Nine"); break;
				default: System.out.println("Invalid Digit");
				}
			}
			
			
			//11. Area of Shapes
			{
				String shape = "Square";
				switch(shape) {
				case "Square":
					int side = 5;
					System.out.println("Area of Square = " + (side * side));
					break;
				case "Circle":
					int r = 3;
					System.out.println("Area of Circle = " + (3.14 * r * r));
					break;
				case "Rectangle":
					int l = 4, b = 6;
					System.out.println("Area of Rectangle = " + (l * b));
					break;
				default:
					System.out.println("Invalid Choice");
				}
			}
			
			
			//12. Check Number Range
			{
				int num = 65;
				switch(num/10) {
				case 0: case 1: case 2: case 3:
					System.out.println("Low");
					break;
				case 4: case 5: case 6: case 7:
					System.out.println("Medium");
					break;
				case 8: case 9: case 10:
					System.out.println("High");
					break;
				default:
					System.out.println("Out of Range");
				}
			}
			
			
			//13. Company Department
			{
				int dept = 3;
				switch(dept) {
				case 1:
					System.out.println("HR");
					break;
				case 2:
					System.out.println("Finance");
					break;
				case 3:
					System.out.println("IT");
					break;
				case 4:
					System.out.println("Marketing");
					break;
				default:
					System.out.println("Invalid Department");
				}
			}
			
			
			//14. Vehicle Type
			{
				int vehicle = 2;
				switch(vehicle) {
				case 1:
					System.out.println("Bike");
					break;
				case 2:
					System.out.println("Car");
					break;
				case 3:
					System.out.println("Bus");
					break;
				case 4:
					System.out.println("Truck");
					break;
				default:
					System.out.println("Invalid Choice");
				}
			}
			
			
			//15. Check Password Strength Level
			{
				int level = 3;
				switch(level) {
				case 1:
					System.out.println("Weak Password");
					break;
				case 2:
					System.out.println("Medium Password");
					break;
				case 3:
					System.out.println("Strong Password");
					break;
				default:
					System.out.println("Invalid Level");
				}
			}

		}
}

