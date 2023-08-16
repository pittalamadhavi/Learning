package methodsPrgm2;

import java.util.Scanner;

public class TemperatureConversion {

	public static void main(String[] args) {
		System.out.println("Welcome to the temperature conversion tool!");
		System.out.println("Selection an option:");
		System.out.println("1.Convert Celsius to Farenheit");
		System.out.println("2.Convert Farenheit to Celcius");
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your choice:");
		int a=scan.nextInt();
		if(a==1)
		{
			System.out.println("enter the Temperature:");
			double c=scan.nextDouble();
			double celsius= TemperatureConversionApp .convertCelsiusToFarenheit(c);
			System.out.println(c+"is equalent to"+celsius);
		}
		else if(a==2)
		{
			System.out.println("enter the Temperature:");
			double f=scan.nextDouble();
			double farenheit=TemperatureConversionApp .convertFarenheitToCelsius(f);
			System.out.println(f+"is equalent to"+farenheit);
			
		}

	}

}
