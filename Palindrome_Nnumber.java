import java.util.Scanner;
public class Palindrome_Nnumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a numbe to find either it's palindrom or not :");
		int number = sc.nextInt();
		int remainder, sum = 0;
		int temp = number;
		
		while(temp !=0) {
		 remainder = temp % 10;
		 sum = (sum*10)+remainder;
		 temp = temp /10;
		 
		}
		
		if (sum == number) {
			System.out.println("The number is a palindrom number.");
		}else {
			System.out.println("The number is not a palindrom number.");
		}		
        sc.close();
	}

}


/*  (Palindrome number) Write a program that prompts the user to enter a three-digit integer and
determines whether it is a palindrome number. A number is palindrome if it reads the same from
right to left and from left to right. Here is a sample run of this program:
Enter a three-digit integer: 121
121 is a palindrome
Enter a three-digit integer: 123
123 is not a palindrome

*/
