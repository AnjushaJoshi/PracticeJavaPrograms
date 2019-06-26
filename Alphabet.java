import java.util.Scanner;

public class Alphabet {

	public static void main(String[] args) 
	{
		char c;
		System.out.println("Enter a character:");
		Scanner scan=new Scanner(System.in);
		c=scan.next().charAt(0);
		
		if(isVowel(c))
		{
			System.out.println(c  +" is a vowel");
		}
		else
		{
			System.out.println(c  +" is a constant");
		}
	}
		public static boolean isVowel(char c) 
		{
			switch(c)
			{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				return true;
			default:
				return false;
				
			}
		}
}
//Output:
//	Enter a character:
//		c
//		c is a constant
//Enter a character:
//i
//i is a vowel

