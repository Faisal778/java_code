
import java.util.Scanner;
public class BMI_calculator {

	public static void main(String[] args) {
		double weight, height, bmi;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter weight in kilogram : ");
		weight = sc.nextDouble();
		System.out.print("Enter height in meter : ");
		height = sc.nextDouble();
		bmi = (double)weight/(height*height);
		System.out.println("Your BMI is : "+bmi);
		sc.close();
		

	}

}
