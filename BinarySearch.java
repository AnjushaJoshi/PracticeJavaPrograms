import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch 
{
	public void binarysearch(int arr[],int first,int last,int key)
	{
		int mid=(first+last)/2;
		while(first<=last)
		{
			if(arr[mid]<key)
			{
				first=mid+1;
			}
			else if(arr[mid]==key)
			{
				
				System.out.println("Element is found at index: "+(mid+1));
				break;
			}
			else
			{
				last=mid-1;
			}
			mid=(first+last)/2;
		}
			
			if(first>last)
			{
				System.out.println("Element not found");
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
		int last=arr.length-1;
		int key;
		for(int i=0;i<n;i++) 
		{
			arr[i]=scan.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("Sorted array:");
		for(int i=0;i<n;i++) 
		{
			System.out.println(arr[i]);
		}
		System.out.println("Enter the key to be searched:");
		key=scan.nextInt();
		BinarySearch b=new BinarySearch();
		b.binarysearch(arr, 0, last, key);

	}

}

//OUtput:
//	Enter the size of the array:
//		10
//		Enter the elements:
//		34
//		56
//		78
//		12
//		554
//		90
//		32
//		17
//		89
//		110
//		Sorted array:
//		12
//		17
//		32
//		34
//		56
//		78
//		89
//		90
//		110
//		554
//		Enter the key to be searched:
//		32
//		Element is found at index: 3

