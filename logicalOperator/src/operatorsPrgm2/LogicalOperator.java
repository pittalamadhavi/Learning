package operatorsPrgm2;

import java.util.Scanner;

public class LogicalOperator {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
    System.out.println("is input valid (true/false):");
    boolean a=scan.nextBoolean();
    System.out.println("Does input meet a certain condition (true/false):");
    boolean b=scan.nextBoolean();
    String c=scan.nextLine();
    ValidInput(a,b);
	}
	
	public static void ValidInput(boolean a,boolean b) {
	if(a&&b)
	{
		System.out.println("Input is valid");
	}
	else if(a||b)
	{
		System.out.println("input is invalid");
	}
	else
	{
		System.out.println("no input");
	}

}
}
