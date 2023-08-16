package methodsPrgm2;

public class TemperatureConversionApp {
	public static double convertCelsiusToFarenheit(double celsius)
	{
		System.out.println("Enter the Temperature in Celsius:");
		double f=((celsius*9/5)+32);
		return f;
		
	}
	
	public static double convertFarenheitToCelsius(double farenheit)
	{
		System.out.println("Enter the Temperature in Farenheit:");
		double c=((farenheit-32)*5/9);
		return c;
			
		
	}

}
