
import java.util.Scanner;
public class MinimumRunwayLength {

	public static void main(String[] args) {
		double speed, acceleration, length;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the speed of airplane : ");
		speed = sc.nextDouble();
		System.out.print("Enter the accleration of airplane : ");
		acceleration = sc.nextDouble();
		
		length = (speed*speed)/((double)acceleration*2);
		System.out.println("The minimum runway length for the airplane is : "+length);
		sc.close();
	}

}

/*   (Physics: finding runway length) Given an airplane’s acceleration a and take-off speed v, you can
compute the minimum runway length needed for an airplane to take off using the following
formula:

length =
v
2
2a

Write a program that prompts the user to enter v in meters/second (m/s) and the acceleration a in
meters/second squared (m/s2), and displays the minimum runway length. Here is a sample run:
Enter speed and acceleration: 60 3.5
The minimum runway length for this airplane is 514.286

*/
