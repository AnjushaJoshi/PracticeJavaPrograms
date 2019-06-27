import java.util.Scanner;

public class ReverseString_recursion 
{
	public static String reverse(String str)
	{
		if(str==null || str.length()<=1)
		{
			return str;
		}
		
			return reverse(str.substring(1))+str.charAt(0);
		
	}

	public static void main(String[] args) 
	{
		String str;
		System.out.println("Enter the string:");
		Scanner scan=new Scanner(System.in);
		str=scan.nextLine();
		System.out.println(reverse(str));

	}

}
