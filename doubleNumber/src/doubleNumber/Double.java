package doubleNumber;

import java.util.Scanner;

public class Double {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number:");
		int num=scan.nextInt();
		System.out.println("enter the double value :");
		int res = doubleNumber(num);
		System.out.println(res);

	}
	public static int doubleNumber(int x)
	{
		return x*2;
	}

}
