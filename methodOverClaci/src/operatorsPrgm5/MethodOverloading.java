package operatorsPrgm5;

import java.util.Scanner;

public class MethodOverloading {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the first no:");
		int a=scan.nextInt();
		System.out.println("Enter the second no:");
		int b=scan.nextInt();
		System.out.println("enter the operator(+,-,*,/):");
		String operator=scan.next();

		
		switch(operator)
		{
		case "+":
			int add=Calculator.calculate(a,b);
			System.out.println("Addition:"+add);
			break;
			
		case"-"	:
			int sub=Calculator.calculate(a,b,operator);
			System.out.println("subtraction:"+sub);
			break;
		case "*":
			int mul=Calculator.calculate(a,operator,b);
			System.out.println("multiplication:"+mul);
			break;
			
		case "/":
			int division=Calculator.calculate(operator,a,b);
			System.out.println("Division:"+division);
			break;
			
			
		}
	}

}
