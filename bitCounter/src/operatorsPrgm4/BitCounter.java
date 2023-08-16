package operatorsPrgm4;

import java.util.Scanner;

public class BitCounter {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		 System.out.println("enter the value:");
		int a=scan.nextInt();
		int c=countSetBit(a);
		System.out.println("number of set bits:"+c);

		}
		public static int countSetBit(int n )
		{
			int count=0;
			while(n!=0)
			{
				count += n&1;
				n>>=1;
			}
			return count;
			

		}

	}


