import java.util.Scanner;

public class ArmstrongNumber 
{

	public static void main(String[] args) 
	{

		int c=0,a,temp;
		System.out.println("Enter a number:");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		temp=n;
		while(n>0)
		{
			a=n%10;
			n=n/10;
			c=c+(a*a*a);
		}
		if(temp==c)
		{
			System.out.println("The no. is an Armstrong number");
		}
		else
		{
			System.out.println("The no. is not an Armstrong number");
		}

	}

}
//Output:
//	Enter a number:
//		153
//		The no. is an Armstrong number
//Enter a number:
//333
//The no. is not an Armstrong number

//
