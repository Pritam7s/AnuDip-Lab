public class TypeCasting{
public static void main(String args[]){
System.out.println("Widening Typecasting");

int a=2;
System.out.println("Integer: "+a);
double b=a;
System.out.println("Double: "+b);

System.out.println();

System.out.println("Narrowing Typecasting");
double myDouble = 7.35d;
System.out.println("Double: "+myDouble);
int num = (int)myDouble;
System.out.println("Integer: "+num);
}
}

/*

float a,b,x;
System.out.println("Enter first number: ");
a=sc.nextInt();
System.out.println("Enter second number: ");
b=sc.nextInt();
if(a>b){
	x=a/b;
	print x;
}
else{
	x=b/a;
	print x;
}

*/
