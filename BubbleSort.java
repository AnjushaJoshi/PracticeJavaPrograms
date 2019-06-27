import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) 
	{
		int temp;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the no of elements:");
		int n=scan.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elements:");
		for(int i=0;i<n;i++)
		{
			a[i]=scan.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Ascending order:");
		for(int i=0;i<n-1;i++)
		{
			System.out.println(a[i]);
		}
		
		System.out.println("Descending order:");
		for(int i=n-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
		
	}

}
