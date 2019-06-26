import java.util.Scanner;

public class FindDuplicateCharacters {

	public static void main(String[] args) 
	{
		String str;
		int count = 0;
		System.out.println("Enter a string:");
		Scanner scan=new Scanner(System.in);
		str=scan.nextLine();
		char strs[];
		strs=str.toCharArray();
		for(int i=0;i<strs.length;i++)
		{
			for(int j=i+1;j<strs.length;j++)
			{
				if(strs[i]==strs[j])
				{
					System.out.println(strs[j]);
					count++;
					break;
				}
			}
			
		}
		
		

	}

}
