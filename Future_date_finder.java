
import java.util.Scanner;
public class Future_date_finder {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int date, daysAfterToday;
	System.out.println("0 for Sunday \n1 for Monday \n2 for Tuesday \n3 for Wednesday \n4 for Thursday \n5 for Friday \n6 for Saturday \n");
	System.out.print("Enter todays number : ");
	date = sc.nextInt();
	System.out.print("Enter the number of days elapsed since today : ");
	daysAfterToday = sc.nextInt();
	int i = (daysAfterToday%7)+date;
	switch(i) {
	case 0:
		System.out.println(daysAfterToday+" days after today is Sunday");
		break;
	case 1:
		System.out.println(daysAfterToday+" days after today is Monday");
		break;
	case 2:
		System.out.println(daysAfterToday+" days after today is Tuesday");
		break;
	case 3:
		System.out.println(daysAfterToday+" days after today is Wednesday");
		break;
	case 4:
		System.out.println(daysAfterToday+" days after today is Thursday");
		break;
	case 5:
		System.out.println(daysAfterToday+" days after today is Friday");
		break;
	case 6:
	System.out.println(daysAfterToday+" days after today is Saturday");
	break;
		
	}
	}
}


/*  (Find future dates) Write a program that prompts the user to enter an integer for today’s day of the
week (Sunday is 0, Monday is 1, ..., and Saturday is 6). Also prompt the user to enter the number of
days after today for a future day and display the future day of the week. Here is a sample run:
Enter today's day: 1
Enter the number of days elapsed since today: 3
Today is Monday and the future day is Thursday

*/
