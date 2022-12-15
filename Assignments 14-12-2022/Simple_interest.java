import java.util.Scanner;
public class Simple_interest{
public static void main(String[] args){
int p,t,r,sum;

Scanner sc= new Scanner(System.in);
System.out.println("Enter amount: ");
p=sc.nextInt();
System.out.println("Enter Time in Year: ");
t=sc.nextInt();
System.out.println("Enter Interest Percentage: ");
r=sc.nextInt();

sum=((p*t*r)/100);
System.out.println("The final Interest will be: " + sum);

}
}
