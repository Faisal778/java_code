import java.util.Scanner;
public class Quadratic_equaion_solve {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a, b, c;
		System.out.println("Enter a , b and c :");
		a  = sc.nextDouble();
		b  = sc.nextDouble();
		c  = sc.nextDouble();
		
		double result = (b*b)-4*a*c;
		double r1 = (-b+(Math.sqrt(result)))/(2.0*a);
		double r2 = (-b-(Math.sqrt(result)))/(2.0*a);
		if (result == 0 ) {
			System.out.println("The equation has one root : "+r1 + "one complex root");
		}else if (result >0) {
			System.out.println("The equation has two roots :"+r1 +" & "+r2);
		}else {
			System.out.println("The system has complex roots.");
		}
		
		
	sc.close();	
	}

}


/*  b^2-4ac is called the discriminant of the quadratic equation. If it is positive, the equation has two real
roots. If it is zero, the equation has one root. If it is negative, the equation has no real roots. Write a
program that prompts the user to enter values for a, b, and c and displays the result based on the
discriminant. If the discriminant is positive, display two roots. If the discriminant is 0, display one
root. Otherwise, display “The equation has no real roots”. */

