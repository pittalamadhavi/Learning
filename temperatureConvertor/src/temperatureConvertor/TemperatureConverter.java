package temperatureConvertor;

import java.util.Scanner;

public class TemperatureConverter {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("enter the values:");
		double far=scan.nextDouble();
		TemperatureConv t1=new TemperatureConv();
		double Celsius=t1.convertFahrenheitToCelsius(far);
		System.out.println(Celsius);
		
				

	}

	
}
