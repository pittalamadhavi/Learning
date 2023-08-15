package stringjoint;

import java.util.Scanner;

public class StringJointer {

	public static void main(String[] args) {
	 Scanner scan = new Scanner(System.in);
	 System.out.println("enter the fn:");
	 String str1=scan.next();
	 System.out.println("enter the la:");
	 String str2=scan.next();
	 System.out.println(joinStrings(str1,str2));
	 

	}
	public static String joinStrings(String str1,String str2)
	{
		return str1+str2;
	}

}
