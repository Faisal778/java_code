
import java.util.Scanner;
public class CelsiusToFarenheit {
	public static void main(String[] args) {
		double celsius, farenheit;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter temperature in Celsius : ");
		celsius = sc.nextDouble();
		farenheit = (9/5.0)*celsius+32;
		System.out.print("The temperature in Farenheit is : "+farenheit);
		
		sc.close();
		
	}

}
