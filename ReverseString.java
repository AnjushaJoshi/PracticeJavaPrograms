import java.util.Scanner;

public class ReverseString {
	void printreversestring()
	{
		String str;
		char[] strs;
		System.out.println("Enter a string:");
		Scanner scan=new Scanner(System.in);
		str=scan.nextLine();
		strs=str.toCharArray();
		System.out.println("The entered string is:");
		for(int i=0;i<strs.length;i++)
		{
			System.out.print(strs[i]);
		}
		System.out.println();
		System.out.println("The reversed string is:");
		for(int i=strs.length-1;i>=0;i--)
		{
			System.out.print(strs[i]);
		}
	}

	public static void main(String[] args) 
	{
		ReverseString reverse=new ReverseString();
		reverse.printreversestring();
		
		
	}

}
