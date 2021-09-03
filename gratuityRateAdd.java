
import java.util.Scanner;
public class gratuityRateAdd {

	public static void main(String[] args) {
		double fair, gratuityRate, total;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter base price : ");
		fair = sc.nextDouble();
		System.out.print("Enter gratuityRate : ");
		gratuityRate = sc.nextDouble();
		gratuityRate = fair*(gratuityRate/100.0);
		total = fair + gratuityRate;
		System.out.println("Base price is : "+fair + "\nGratuity Rate is : "+gratuityRate+ 
				"\nTotal is : "+total);
		sc.close();
		

	}

}

/*  (Financial application: calculate tips) Write a program that reads the subtotal and the gratuity rate,
then computes the gratuity and total. For example, if the user enters 10 for subtotal and 15% for
gratuity rate, the program displays $1.5 as gratuity and $11.5 as total. Here is a sample run:
Enter the subtotal and a gratuity rate: 10 15
The gratuity is $1.5 and total is $11.5  */
