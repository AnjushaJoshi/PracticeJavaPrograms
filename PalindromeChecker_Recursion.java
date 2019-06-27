import java.util.Scanner;

public class PalindromeChecker_Recursion 
{
	public static boolean isPalindrome(String str)
	{
		if(str==null)
		{
			return false;
		}
		if(str.length()<=1)
		{
			return true;
		}
		String first=str.substring(0, 1); //fetch first character
		String last=str.substring(str.length()-1,str.length());
		if(!first.equals(last))
		{
			return false;
		}
		else
		{
			return isPalindrome(str.substring(1, str.length()-1));
		}
	}

	public static void main(String[] args) 
	{
		String str;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the string:");
		str=scan.nextLine();
		boolean result=isPalindrome(str);
		System.out.println(str+" IsPalindrome="+result);

	}

}
//output:
//	Enter the string:
//		madam
//		madam IsPalindrome=true
//Enter the string:
//logic
//logic IsPalindrome=false


