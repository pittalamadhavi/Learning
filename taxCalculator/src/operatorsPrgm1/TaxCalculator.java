package operatorsPrgm1;

import java.util.Scanner;

public class TaxCalculator {

	public static void main(String[] args) {
		 Scanner scan=new Scanner (System.in);
		 System.out.println("enter the purchase amount:");
	     double amount=scan.nextDouble();
	     System.out.println("enter the tax rate:");
	     double tax=scan.nextDouble();
	     double res=calculateTotalwithTax(amount,tax);
	     System.out.println("total cost including tax:"+res);
	     
		}
		public static double calculateTotalwithTax(double amount,double tax)
		{
			double totalcost;
			totalcost=(amount*tax)+amount;
			
			return totalcost;
		}

	}


