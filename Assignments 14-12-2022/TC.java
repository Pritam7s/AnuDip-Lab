public class TC{
public static void main(String args[]){
System.out.println("Auto Wide Typecasting");

int a=2,c=12,d=5;
System.out.println("Integer: "+a);
double b=a;
System.out.println("Double: "+b);

System.out.println();

System.out.println("Manual Narrowing Typecasting");
double myDouble = 7.35d;
System.out.println("Double: "+myDouble);
int num = (int)myDouble;
System.out.println("Integer: "+num);
System.out.println("-------------------------");
/*
float x,y,z;
y=c;z=d;
x=(y/z);
*/
x=(float)c/(float)d;
System.out.println(x);
}
}
