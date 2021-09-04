import java.util.Scanner;
public class Rock_Paper_Scissor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		int n = (int)(Math.random()*(2-0)+1);
		String one, two;
		System.out.print("Enter one value. scissor (0), rock (1), paper (2) : ");
		int input = sc.nextInt();
		if (n == 0)
			 one = "scissor";
		else if (n==1)
			one = "rock";
		else 
			one = "paper";
		if (input == 0)
			two = "scissor";
		else if (input==1)
			two = "rock";
		else 
			two = "paper";
		if (input == n)
			System.out.println("The computer is "+one +". You are "+two+" It's a draw.");
		else if (input == 1 && n == 0) {
			System.out.println("The computer is scissor. You are rock. You won");
		}else if ( (input == 0 && n == 2)) {
			System.out.println("The computer is paper. You are scissor. You won");
		}else if ( (input == 2 && n == 1)) {
		System.out.println("The computer is rock. You are paper. You won");
	}else {
			System.out.println("The computer is "+one +". You are "+two+". computer won");
		}
		
   sc.close();
	}

}

/* (Game: scissor, rock, paper) Write a program that plays the popular scissor-rock-paper game. (A
scissor can cut a paper, a rock can knock a scissor, and a paper can wrap a rock.) The program
randomly generates a number 0, 1, or 2 representing scissor, rock, and paper. The program prompts
the user to enter a number 0, 1, or 2 and displays a message indicating whether the user or the
computer wins, loses, or draws. Here are sample runs:
scissor (0), rock (1), paper (2): 1
The computer is scissor. You are rock. You won
scissor (0), rock (1), paper (2): 2
The computer is paper. You are paper too. It is a draw

*/
