
import java.util.Scanner;
public class AverageSpeedInKilometerToMiles {
	public static void main(String[] args) {
		double distance = 0, kmToMile= 0, timeTaken=0, kmAVG =0.0;
		int hour = 0, minute = 0, seconds = 0;
		
	    
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter the distance in Kilometer :");
	    distance = sc.nextDouble();
	    System.out.print("Enter the hour needed to cover the distance : ");
	    hour = sc.nextInt();
	    System.out.print("Enter the minute needed to cover the distance : ");
	    minute = sc.nextInt();
	    System.out.print("Enter the seconds needed to cover the distance : ");
	    seconds = sc.nextInt();
	    
	    timeTaken = (hour*60) + (minute)+ (seconds/60.0);
	    kmAVG = ((double)distance/timeTaken)*60.0;
	    kmToMile = kmAVG*(1/1.6);
	    System.out.println("The average speed in mile per hour is : "+kmToMile); 
	sc.close();
	    
	    
	}

}
