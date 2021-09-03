
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
