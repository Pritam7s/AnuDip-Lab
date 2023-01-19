package restaurant;

import java.util.*;
import java.util.Scanner;

public class RestaurantMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<Integer, Restaurant> map = new HashMap<Integer, Restaurant>();
		map.put(1, new Restaurant("Chicken Biriyani", 130));
		map.put(2, new Restaurant("Paneer Masala", 120));
		map.put(3, new Restaurant("Chicken Momo", 80));
		map.put(4, new Restaurant("Mushroom Chili", 120));
		
		System.out.println("{--- Welcome to C3805 Restaurant ---}");
		System.out.println("=====================================");
		System.out.println("\t< Menu >");
		System.out.println("\t--------");
		System.out.println("No \t Items \t\t Price");
		
		for(Map.Entry em: map.entrySet()) {
			Restaurant rest = (Restaurant) em.getValue();
			System.out.print(em.getKey()+"> ");
			rest.display();
		}
		System.out.println("-------------------------------------");
		System.out.println();
		do {
			System.out.println("Enter Food No to Order: ");
			int id = sc.nextInt();
			Restaurant rest = map.get(id);
			Billing.order(rest.getFname(), rest.getPrice());
			
			Billing.cont();
		}while(true);
	}

}
