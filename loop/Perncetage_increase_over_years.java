import java.util.Scanner;
public class Perncetage_increase_over_years {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc = new Scanner (System.in);
         System.out.print("Enter the amount : ");
         int price = sc.nextInt();
         System.out.print("Enter the percentage : ");
         int percentage = sc.nextInt();
         System.out.print("Enter total years : ");
         int year = sc.nextInt();
         while(year != 0) {
        	 price += price*(double)(percentage/100.0);
        	 year--;
         }
         System.out.println("The price after "+year+" with "+percentage+"increase is : "+price);
		sc.close();
	}

}


/*   (Financial application: compute future tuition) Suppose that the tuition for a university is $10,000
this year and increases 5% every year. In one year, the tuition will be $10,500. Write a program that
computes the tuition in ten years and the total cost of four years’ worth of tuition after the tenth year.
*/
