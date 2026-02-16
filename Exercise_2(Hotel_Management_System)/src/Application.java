
import java.util.*;

public class Application {
	
	public static void main(String[] args) {
		
		
		Map<Integer,CustomerData> data = new HashMap<>();
		Map<Integer,FoodData> foods = new HashMap<>(
				Map.of(
						1, new FoodData("Pizza" , 100),
						2, new FoodData("Burger" , 30),
						3, new FoodData("French Fries" , 60),
						4, new FoodData("Chicken Roll" , 70)
						
						)
				);
		
		List<Integer> li = new ArrayList<>();
				
		
		int id = 0;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			id++;
			
			System.out.print(id + "]" + " Enter Your Name: ");
			String name = sc.nextLine();
			
			
			System.out.print("   "+"Enter Ordered dish codes from 1 to 3(Press 99 to exit or any key to continue): ");
		
			
			while(true) {
				int dishcode = sc.nextInt();
				
			
				if(dishcode == 99) {
					break;
				}
				
				if(dishcode < 0 || dishcode >4 ) {
					System.out.println("Please Enter Valid Id");
					continue;
				}
				
				li.add(dishcode);
				
				
			}
		
			data.put(id, new CustomerData(name , new ArrayList<>(li)) );
			
			li.clear();
			
			
			
			
			System.out.println("Press 0 to exit or any number to add new person");
			int option = sc.nextInt();
			
			sc.nextLine();
			
			if(option == 0) {
				break;
			}
			
		}
		
		
		System.out.println();
		for(int key : data.keySet()) {
			
			CustomerData obj = data.get(key);
			
			int totalBill = 0;
			
			for(int dishcode: obj.dishes ) {
		        
				FoodData foodObj = foods.get(dishcode);
				
				totalBill = totalBill + foodObj.price;
			}
			
			
			
			System.out.println("id = " + key);
			System.out.println("name = " + obj.name);
			System.out.println("ToalBill = "+ totalBill);
			
			
			System.out.println("--------------------------------------------------------" );
			
		}
		
	
		
	}
	
	
	static class CustomerData{
		
		String name;
		List<Integer> dishes;
		
		CustomerData(String name ,List<Integer> dishes){
		
			this.name = name;
			this.dishes = dishes;
		}
	}
	
	
	static class FoodData{
		
		String name;
		int price;
		
		FoodData(String name , int price){
			this.name = name;
			this.price = price;
		}
		
	}
}
