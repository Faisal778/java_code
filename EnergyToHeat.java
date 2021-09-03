package lab_manual_1;
import java.util.Scanner;
public class EnergyToHeat {

	public static void main(String[] args) {
		double waterAmount, initialTemp, finalTemp, energy;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter teh amount of Water in Kilograms : ");
		waterAmount = sc.nextDouble();
		System.out.print("Enter the initial temperatue : ");
		initialTemp = sc.nextDouble();
		System.out.print("Enter the final temperature :");
		finalTemp = sc.nextDouble();
		energy = waterAmount*(finalTemp - initialTemp) *4184;
		System.out.println("The energy needed is : "+energy);
		
	}

}
