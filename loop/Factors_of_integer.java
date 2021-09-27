import java.util.Scanner;
public class Factors_of_integer {

	public static void main(String[] args) {
		// factors finding using loop.I should try using recursion later. 
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number you want to find factors for : ");
		int number = sc.nextInt();
		int i = 2, count = 0;
		int temp = number;
		System.out.print("The factorials are : ");
		while(i<=temp/2) {
			if (number%i==0) {
				System.out.print(i+" ");
				number = number/i;
				count++;
				continue;
			}else
				i++;
		}
		if (count==0) {
			System.out.print("The factorials are : 1 "+number);
		}
		sc.close();
	}

}

/* (Find the factors of an integer) Write a program that reads an integer and displays all its smallest
factors in increasing order. For example, if the input integer is 120, the output should be as follows:
2, 2, 2, 3, 5. */
