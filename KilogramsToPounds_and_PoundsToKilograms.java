/* (Conversion from kilograms to pounds and pounds to kilograms) Write a program that displays the
following two tables side by side:
*/

import java.util.Scanner;
public class KilogramsToPounds_and_PoundsToKilograms {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);// TODO Auto-generated method stub
		int n;
		System.out.print("Enter total number of inputs : ");
		n = sc.nextInt();
		double array[];
		array = new double[n];
		for (int i = 0; i<n; i++) {
			array[i]=sc.nextDouble();
		}
		kiLogramToPound(array, n);
		 sc.close();
	}

 public static void kiLogramToPound(double array[], int n) {
	   System.out.println("Enter "+n+" numbers : ");
	   System.out.println("kilograms   pounds            Pounds       kilograms ");
	   for (int i = 0; i<n; i++) {
	      double kgToPl = (array[i]*2.2);
	      double plTokg = (array[i]/2.2);
	      System.out.print(""+array[i]+"         "+String.format("%.2f",kgToPl));
	      System.out.println("            "+array[i]+"         "+String.format("%.2f", plTokg));
	      
	   }
   }
  
}
