import java.util.Scanner;

public class CountCharacters 
{
	public static int count(String s,char c)
	{
		int countt=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==c)
			{
				countt++;
			}
			
		}
		return countt;
	}

	public static void main(String[] args) 
	{
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the string:");
		String str=scan.nextLine();
		System.out.println("Enter the character to be counted:");
		char cc=scan.next().charAt(0);
		System.out.println(count(str,cc));
	}

}
