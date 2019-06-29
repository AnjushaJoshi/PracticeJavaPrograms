import java.util.Scanner;

public class Fibonacci 
{

	public static void main(String[] args) 
	{
		int num,t1=0,t2=1,sum;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the no. of times you want to print the Fibonacci Series:");
		num=scan.nextInt();
		System.out.println("Fibonacci Series:");
		for(int i=0;i<num;i++)
		{
			System.out.println(t1+" ");
			sum=t1+t2;
			t1=t2;
			t2=sum;
		}
		
		

	}

}

//Output:
//	Enter the no. of times you want to print the Fibonacci Series:
//		10
//		Fibonacci Series:
//		0 
//		1 
//		1 
//		2 
//		3 
//		5 
//		8 
//		13 
//		21 
//		34 
//
