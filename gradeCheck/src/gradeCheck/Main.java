package gradeCheck;

import java.util.Scanner;

public class Main {
	
	public static void checkGrade(int grade) {
		if(grade>50)
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
        int grade=scan.nextInt();
        checkGrade(grade);
        
	}

}
