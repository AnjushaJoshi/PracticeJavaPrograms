import java.util.Scanner;

public class SelectionSort 
{
	int min,temp;
	void selectionsort(int arr[],int n)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			min=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[min])
				{
					min=j;
				}
			}
			int temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
			
		}
	}

	public static void main(String[] args) 
	{
		int n;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		n=scan.nextInt();
		System.out.println("Enter the elements:");
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++) 
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("Before sorting:");
		for(int i=0;i<n;i++) 
		{
			System.out.println(arr[i]);
		}
		
		SelectionSort s=new SelectionSort();
		
		s.selectionsort(arr, n);
		
		System.out.println("After sorting:");
		for(int i=0;i<n;i++) 
		{
			System.out.println(arr[i]);
		}
	}

}

//OUtput:
//	Enter the size of the array:
//		10
//		Enter the elements:
//		4
//		6
//		2
//		89
//		23
//		45
//		90
//		76
//		78
//		12
//		Before sorting:
//		4
//		6
//		2
//		89
//		23
//		45
//		90
//		76
//		78
//		12
//		After sorting:
//		2
//		4
//		6
//		12
//		23
//		45
//		76
//		78
//		89
//		90

