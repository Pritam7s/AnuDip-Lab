import java.util.Scanner;
public class Multi{
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
int a,b, add,multi;
System.out.println("Enter first number: ");
a=sc.nextInt();
System.out.println("Enter second number: ");
b=sc.nextInt();
add=a+b;
multi=a*b;
System.out.println("Addition value: "+add);
System.out.println("Multiplication value: "+multi);

}
}