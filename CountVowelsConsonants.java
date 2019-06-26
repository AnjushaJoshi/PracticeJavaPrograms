import java.util.Scanner;

public class CountVowelsConsonants 
{
    public static void main(String[] args) 
    {
    	Scanner scan=new Scanner(System.in);
    	System.out.println("Enter the string:");
    	String str=scan.nextLine();
        
        int vowels = 0, consonants = 0,spaces=0;
        str = str.toLowerCase();
        for(int i = 0; i < str.length(); ++i)
        {
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i'
                || ch == 'o' || ch == 'u') {
                ++vowels;
            }
            else if((ch >= 'a'&& ch <= 'z')) {
                ++consonants;
            }
           
            else if (ch ==' ')
            {
                ++spaces;
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
       
        System.out.println("White spaces: " + spaces);
    }
}
//Output:
//	Enter the string:
//		anjusha joshi
//		Vowels: 5
//		Consonants: 7
//		White spaces: 1
