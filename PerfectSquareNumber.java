import java.util.*;
import java.math.*;
public class PerfectSquareNumber 
{
	static boolean isPerfectSquare(double number)
	{
		int iVar;
	    float fVar;
	 
	    fVar=(float) Math.sqrt(number);
	    iVar=(int) fVar;
	 
	    if(iVar==fVar)
	        return true;
	    else
	        return false;
	}


	public static void main(String[] args) 
	{
		int num;
	   System.out.println("Enter an integer number: ");
	   Scanner scan=new Scanner(System.in);
	   num=scan.nextInt();
	 
	    if(isPerfectSquare(num))
	       System.out.println(num+" is a perfect square.");
	    else
	        System.out.println(num+" is not a perfect square.");
	     
	    

	}

}

//OUtput:
//	Enter an integer number: 
//		45
//		45 is not a perfect square.
//Enter an integer number: 
//121
//121 is a perfect square.