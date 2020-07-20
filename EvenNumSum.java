import java.util.Scanner;

public class EvenNumSum {

	public static void main(String[] args) {
		// Creating Scanner
		Scanner scan = new Scanner(System.in);
		
		// Asking user for number 2 or greater
		System.out.print("Enter a number, 2 or greater: ");
		int number = scan.nextInt();
		
		// If number is less then 2 it ask user again
		// to enter a number 2 or greater
		while(number < 2) {
			System.out.print("I said enter a number greater then 2: ");
			number = scan.nextInt();
		}
		
		// Creating a variable to sum all even numbers
		// between 2 and number input by user
		int sum = 0;
		for(int i = 0; i <= number; i+=2) {
			sum += i;
		}
		
		// printing sum of numbers
		System.out.print("The sum of numbers between 2 and " + number + " is " + sum);
		
		
				

	}

}
