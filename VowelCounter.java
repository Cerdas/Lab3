import java.util.Scanner;

public class VowelCounter {

	public static void main(String[] args) {
		// Creating Scanner
		Scanner scan = new Scanner(System.in);
		
		// Asking user to enter a word in
		System.out.print("Enter any word: ");
		String word = scan.nextLine();
		
		// initializing variables for each lower
		// case vowel and a non vowel variable
		int a = 0;
		int e = 0;
		int i = 0;
		int o = 0;
		int u = 0;
		int non = 0;
		
		// Checking each letter of the word for vowels
		// and counting each letter
		for(int s = 0; s < word.length(); s++) {
			if(word.charAt(s)=='a') {
				a++;
			}
			else if(word.charAt(s)=='e') {
				e++;
			}
			else if(word.charAt(s)=='i') {
				i++;
			}
			else if(word.charAt(s)=='o') {
				o++;
			}
			else if(word.charAt(s)=='u') {
				u++;
			}
			else {
				non++;
			}
		}
		
		// Printing out how many vowels and non vowels 
		// there are in the word
		System.out.println("The word " + word + " has:");
		System.out.println(a + " lower case a's");
		System.out.println(e + " lower case e's");
		System.out.println(i + " lower case i's");
		System.out.println(o + " lower case o's");
		System.out.println(u + " lower case u's");
		System.out.println(non + " non vowels");

	}

}
