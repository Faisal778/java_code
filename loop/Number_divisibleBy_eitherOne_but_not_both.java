import java.util.Scanner;
public class Number_divisibleBy_eitherOne_but_not_both {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the dividend : ");
		double dividend = sc.nextDouble();
		System.out.print("Enter the first divisor : ");
		int divisor1 = sc.nextInt();
		System.out.print("Enter the second divisor : ");
		int divisor2 = sc.nextInt();
		
		if (dividend%divisor1 == 0 && dividend%divisor2 == 0) {
			System.out.print("The number is divisible by both.");
		}else if (dividend%divisor1 ==0 && dividend%divisor2 != 0) {
			System.out.print("The number is divisible by "+divisor1);
		}else if (dividend%divisor1 != 0 && dividend%divisor2 == 0) {
			System.out.print("The number is divisible by : "+divisor2);
		}else {
			System.out.print("The number is not divisble by none of those numbers.");
		}
		
		// finding from given range 
		
		System.out.print("Enter lower range :");
		int lower_range = sc.nextInt();
		System.out.print("Enter higher range : ");
		int higher_range = sc.nextInt();
		int count = 0;
		while (lower_range <= higher_range) {
			if ((lower_range%divisor1 ==0 && higher_range%divisor2 != 0) || 
			   (lower_range%divisor1 != 0 && higher_range%divisor2 == 0)) {
				count++;
				System.out.print(lower_range+"\t");
				if (count %10 == 0)
					System.out.print("\n");
			}
			lower_range++;
		}	
		sc.close();
	}

}

/*  (Find numbers divisible by 5 or 6, but not both) Write a program that displays all the numbers from
100 to 200, ten per line, that are divisible by 5 or 6, but not both. Numbers are separated by exactly
one space. */
