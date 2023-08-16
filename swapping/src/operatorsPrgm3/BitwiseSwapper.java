package operatorsPrgm3;

import java.util.Scanner;

public class BitwiseSwapper {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the first no:");
		int a=scan.nextInt();
		System.out.println("Enter the second no:");
		int b=scan.nextInt();
		System.out.println("Before swapping:"+a+" "+b);
		 swapUsingBitwise(a,b);

	}
    public static void  swapUsingBitwise(int a,int b)
    
    {
    	
    	 a=a^b;
    	 b=a^b;
    	a=a^b;
    
    	System.out.println("After swapping:"+a+ " "+b);
    }
    	
    

	}


