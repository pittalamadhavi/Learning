package arithmetic;

import java.util.Scanner;

public class ArithmeticDemo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
        System.out.println("enter two numbers:");
        long num1=scan.nextLong();
        long num2=scan.nextLong();
       
        System.out.println(addition(num1,num2));
	}
	public static long addition(long a,long b)
	{
		return a+b;
	}

}
