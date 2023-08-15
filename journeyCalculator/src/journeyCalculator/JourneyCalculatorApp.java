package journeyCalculator;

import java.util.Scanner;

public class JourneyCalculatorApp {

	public static void main(String[] args) {
		Scanner scan =new Scanner (System.in);
		System.out.println("Enetr speed and time to clacuate distance");
		double time=scan.nextDouble();
		double speed=scan.nextDouble();
		JourneyCalculator j1=new JourneyCalculator();
		double distance=j1.calculateDistance(time, speed);
		System.out.println(distance);
		
		

	}

}
