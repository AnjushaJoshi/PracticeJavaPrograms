import java.util.Scanner;
//A year is a leap year if −
//
//1. It is divisible by 400
//2. It is divisible by 4 but not 100
//Algorithm:
//	1. Take integer variable year
//	2. Assign a value to the variable
//	3. Check if the year is divisible by 4 but not 100, DISPLAY "leap year"
//	4. Check if the year is divisible by 400, DISPLAY "leap year"
//	5. Otherwise, DISPLAY "not leap year"
public class LeapYear 
{

	public static void main(String[] args) 
	{
		int year;
		System.out.println("Enter an year:");
		Scanner scan=new Scanner(System.in);
		year=scan.nextInt();
		if((year%4==0) && (year%100!=0) || (year%400==0))
		{
			System.out.println("The year is a leap year.");
		}
		else
		{
			System.out.println("Not a leap year.");
		}
			
		

	}

}
//Output:
//	Enter an year:
//		2100
//		Not a leap year.
//Enter an year:
//2020
//The year is a leap year.