
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
