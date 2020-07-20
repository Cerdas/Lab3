import java.util.Random;
import java.util.Scanner;

public class AgeGuess4 {

	public static void main(String[] args) {
		// Creating Scanner and Random
		Scanner scan = new Scanner(System.in);
		Random num = new Random();
				
		// Creating variables and initialize age
		String name;
		int ageGuess;
		int age = num.nextInt(100);
		
		
		// Asking user to input name using scan
		System.out.print("Enter your name: ");
		name = scan.nextLine();

		// Asking user to input age using scan
		System.out.print("Guess your age: ");
		ageGuess = scan.nextInt();
		
		// Checking to see if the ageGuess matches age
		while(ageGuess != age) {
			if(ageGuess > age) {
				System.out.print("You guessed wrong, Guess Younger: ");
				ageGuess = scan.nextInt();
			}
			if(ageGuess < age) {
				System.out.print("You guessed wrong, Guess Older: ");
				ageGuess = scan.nextInt();
			}
		}
		
		// Displays when you guess the age right
		System.out.print(name + ", You guessed the age right!");
	}

}
