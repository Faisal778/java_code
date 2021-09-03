
import java.util.Scanner;
public class AreaAndPermieterOfCircle {
	final static double PI = 3.1416;
	public static void main(String[] args) {
		double r, area, perimeter;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the radius of the circle :");
		r = sc.nextDouble();
		area = PI*r*r;
		perimeter = 2*PI*r;
		System.out.println("The area of the circle is : "+area);
		System.out.println("The perimter of the circle is : "+perimeter);
		sc.close();
	}

}
