
public class FirstHundredPrimeNumbers 
{
	void displayprimenos()
	{
		int temp = 0;
		for(int i=1;i<=100;i++)
		{
			for(int j=2;j<=i-1;j++)
			{
				if(i%j==0)
				{
					temp=temp+1;
				}
				
			}
			if(temp==0)
			{
				System.out.print(i+"\t");
			}
			else
			{
				temp=0;
			}
		}
		
	}

	public static void main(String[] args)
	{
		FirstHundredPrimeNumbers obj=new FirstHundredPrimeNumbers();
		System.out.println("Prime nos from 1 to 100 are:");
		obj.displayprimenos();

	}

}

//Output:
//	Prime nos from 1 to 100 are:
//		1	2	3	5	7	11	13	17	19	23	29	31	37	41	43	47	53	59	61	67	71	73	79	83	89	97	
