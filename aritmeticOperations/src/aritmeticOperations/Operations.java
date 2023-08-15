package aritmeticOperations;

import java.util.Scanner;

public class Operations {

	public static void main(String[] args) {
	
   Scanner scan=new Scanner(System.in);
   System.out.println("enter the two numbers:");
   int num1=scan.nextInt();
   int num2=scan.nextInt();
   System.out.println(sub(num1,num2));
   System.out.println("enter the two numbers:");
   num1=scan.nextInt();
   num2=scan.nextInt();
   System.out.println(mul(num1,num2));
   System.out.println("enter the two numbers:");
   num1=scan.nextInt();
   num2=scan.nextInt();
   System.out.println(div(num1,num2));
   
   System.out.println("enter the two numbers:");
   num1=scan.nextInt();
   num2=scan.nextInt();
   System.out.println(remainder(num1,num2));
   
   
	}
	public static int sub(int num1, int num2)
	{
		return num1-num2;
		
	}
	public static int mul(int num1, int num2)
	{
		return num1*num2;
		
	}
	public static double div(int num1, int num2)
	{
		return num1/num2;
		
	}
	public static int remainder(int num1, int num2)
	{
		return num1%num2;
		
	}
}
