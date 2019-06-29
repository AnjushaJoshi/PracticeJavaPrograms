import java.util.Scanner;

public class LinearSearch 
{


	public static void main(String[] args) 
	{
		int i,n;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		 n=scan.nextInt();
		System.out.println("Enter the elements:");
		int arr[]=new int[n];
		for( i=0;i<n;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter the element to search:");
		
		int key=scan.nextInt();
		for( i=0;i<n;i++)
		{
			if(arr[i]==key)
			{
				System.out.println(key + " is present at location" + (i+1) + ".");
				break;
			}
		}
		if(i==n)
		{
			System.out.println(key + " isn't present");
		}
		
		
	}

}
//OUtput:
//	Enter the size of the array:
//		5
//		Enter the elements:
//		67
//		8
//		3
//		22
//		1
//		Enter the element to search:
//		10
//		10 isn't present

//Enter the size of the array:
//5
//Enter the elements:
//89
//23
//45
//100
//22
//Enter the element to search:
//45
//45 is present at location3.
