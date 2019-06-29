import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) 
	{
		String ans=" ";
		do
		{
			
			int num,i,fact=1;
			
			System.out.println("Enter the number whose factorial is to be calculated:");
			Scanner scan=new Scanner(System.in);
			num=scan.nextInt();
			for(i=1;i<=num;i++)
			{
				fact=fact*i;
			}
			System.out.println("Factorial of the number is:"+fact);
			System.out.println("Do you want to continue?(Press:Y/y and press other key to stop)");
			 ans=scan.next();
		}while(ans.equals("y") || ans.equals("Y"));

	}

}
