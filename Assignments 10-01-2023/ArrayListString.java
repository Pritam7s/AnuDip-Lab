package collections;
import java.util.*;

public class ArrayListString {

	public static void main(String[] args) {
		ArrayList<String> alist = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		String str, str2;
		
		System.out.println("Enter the Strings: ");
		for(int i=0; i<5; i++) {
			str = sc.next();
			alist.add(str);
		}
		System.out.println("\nStrings are: " + alist);
		System.out.println("\nPrinting Using For Loop: ");
		for(int i=0;i<alist.size();i++) {
			System.out.print(alist.get(i) + " . ");
		}
		
		//Sorting in Ascending Order
		Collections.sort(alist);
		System.out.println("\n\nSorted in Ascending Order: " + alist);
		//Sorting in Descending Order
		Collections.sort(alist, Collections.reverseOrder());
		System.out.println("Soretd in Descending Order: " + alist);
		//Adding String at Certain Positions
		alist.add(3,"Coding");
		System.out.println("\nAfter adding the String 'Coding': "+ alist);
		
 		System.out.println("\nEnter a new String to add: ");
		str2 = sc.next();
		System.out.println("Enter The Position to add:");
		int x= sc.nextInt();
		alist.add(x, str2);
		System.out.println("\nAfter adding a String at Position "+x+" : "+ alist);
		//Replacing a String from a particular Position
		alist.set(x, "ArrayListString");
		System.out.println("\nAfter Replacing: "+alist);
		//Removing a String 
		alist.remove(x);
		System.out.println("After Removing by index: "+alist);
		//alist.remove(str2);
		System.out.println("After Removing by object: "+alist.remove("Coding"));
		System.out.println("\nOriginal Array afetr all Modification: "+alist);
		//Copy
		ArrayList<String> alist2 =new ArrayList<String>();
		alist2.addAll(alist);
		System.out.println("\nCopied Array List: "+alist2);
		
	}

}
