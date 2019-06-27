import java.util.Scanner;

public class ReverseArray_recursion 
{
	public static void reverse(int arr[],int start,int end)
	{
		//terminating condition
		if(start>=end)
		{
			return;
		}
		//swap logic
		int temp=arr[start];
		arr[start]=arr[end];
		arr[end]=temp;
		//recursive call
		reverse(arr,start+1,end-1);
	}

	public static void main(String[] args) 
	{
Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter size of array:");
		int n=scan.nextInt();
		int arr[]=new  int[n];
		System.out.println("Enter the array elements:");
		for(int i=0;i<n;i++)
		{
			arr[i]=scan.nextInt();
		}
		//reverse the array
		reverse(arr,0,n-1);
		System.out.println("After reversing the array:");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}

	}

}
