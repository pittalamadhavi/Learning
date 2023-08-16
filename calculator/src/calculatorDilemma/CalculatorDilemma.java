package calculatorDilemma;

import java.util.Scanner;

public class CalculatorDilemma {

	public static void main(String[] args) {
		
			Scanner scan=new Scanner(System.in);
			System.out.println("enter the values:");
			int a=scan.nextInt();
			int b=scan.nextInt();
			System.out.println("enter the num:");
			System.out.println("1.add,2.sub,3.mul,4.division");
			int num=scan.nextInt();
			
			
		    switch(num)
		    {
		    case 1:
		    	System.out.println("addition :"+(a+b));
		    	break;
		    	
		    case 2:
		    	System.out.println("sub:"+(a-b));
		    	break;
		    	
		    case 3:
		    	System.out.println("mul:"+(a*b));
		    	break;
		    	
		    case 4:
		    	System.out.println("division:"+(a/b));
		    	break;
		    	
		    default:
		         System.out.println("no operation");
		    }
		    
		    
			
			
	}

}
