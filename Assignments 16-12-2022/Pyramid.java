package basic;

public class Pyramid {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) //outer loop for Rows
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
