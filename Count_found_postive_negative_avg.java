import java.util.Scanner;
public class Count_found_postive_negative_avg {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = 1, pos = 0, neg = 0, sum = 0, count=0;
		double avg;
		System.out.print("Enter any Integer. Enter 0 to end.");
		while (input != 0) {
		    input = sc.nextInt();
			if (input >0)
				pos++;
			else if (input <0)
				neg++;
			sum = sum +input;
			count++;
			
		}
		avg = sum/(double)count;
		System.out.println("The number of positives is : "+pos);
		System.out.println("The number of negatives is : "+neg);
		System.out.println("The total is : "+sum);
		System.out.println("The number of average is : "+avg);
		
	}

}

/* (Count positive and negative numbers and compute the average of numbers) Write a program that
reads an unspecified number of integers, determines how many positive and negative values have
been read, and computes the total and average of the input values (not counting zeros). Your program
ends with the input 0. Display the average as a floating-point number. Here is a sample run:
Enter an integer, the input ends if it is 0: 1 2 -1 3 0
The number of positives is 3
The number of negatives is 1
The total is 5.0
The average is 1.25 */
