import java.util.Scanner;
public class Perimeter_of_triangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the edges of triangle : ");
		double edge1 = sc.nextDouble();
		double edge2 = sc.nextDouble();
		double edge3 = sc.nextDouble();
		
		if ((edge1 + edge2 <edge3) || (edge2 + edge3 < edge1) || (edge3 + edge1 < edge2) ) {
			System.out.println("This edges can't form a triangele.");
		}else {
			System.out.println("This edges can form a triangele.");
		}
		sc.close();
	}

}

/*  (Compute the perimeter of a triangle) Write a program that reads three edges for a triangle and
computes the perimeter if the input is valid. Otherwise, display that the input is invalid. The input is
valid if the sum of every pair of two edges is greater than the remaining edge. */
