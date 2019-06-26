import java.util.Scanner;

public class AverageArrayElements 
{
	double average(int a[], int n) 
    { 
          
        // Find sum of array element 
        int sum = 0; 
          
        for (int i = 0; i < n; i++) 
            sum += a[i]; 
      
        return sum / n; 
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
		AverageArrayElements ele=new AverageArrayElements();
		System.out.println("Average of the array elements is:");
		System.out.println(ele.average(arr, n)); 
	}

}
//Output:
//	Enter size of array:
//		5
//		Enter the array elements:
//		21
//		22
//		45
//		34
//		21
//		Average of the array elements is:
//		28.0

