
import java.util.Scanner;
import java.lang.Math;
public class Pow_implemennt {

	public static void main(String[] args) {
		double a, b;
		
		Scanner sc = new Scanner(System.in);
		int i = 0;
		while(i!=909) {
		System.out.print("Enter a : ");
		a = sc.nextDouble();	
		System.out.print("Enter b : ");
		b = sc.nextDouble();
		System.out.println(a+" to the power of "+b+" is "+ Math.pow(a,b));
		System.out.print("Enter 909 to end further calculation. press any number to count again : ");
	    i = sc.nextInt();
		
		}
		sc.close();

	}

}

