import java.util.Scanner;

public class Factorial_recursion 
{
	static int fact=1;
	public static void main(String[] args) 
	{
		System.out.println("Enter the number:");
		Scanner scan=new Scanner(System.in);
		int no=scan.nextInt();
		Factorial_recursion rec=new Factorial_recursion();
		rec.calcfact(no);
		
		
		System.out.println("factorial of the no."+ no + " is:"+fact);
		
	}
	void calcfact(int no)
	{
		if(no>=1)
		{
			fact=fact*no;
			calcfact(no-1);
		}
	}
//	Output:
//		Enter the number:
//			3
//			factorial of the no.3 is:6


}
