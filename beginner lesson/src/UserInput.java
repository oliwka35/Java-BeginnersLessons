import java.util.Scanner;

public class UserInput {
	public static void main(String[] args) {
		/*
		 * create a scanner object Scanner input = new Scanner(System.in); ask
		 * the name of user System.out.println("What is your name?"); // wait
		 * for user to enter String line = input.nextLine(); //greet them
		 * System.out.println("Hi " + line + ". Nice to meet you.");
		 * System.out.println("How old are you?"); int age = input.nextInt();
		 * System.out.println(" Your age is " + age);
		 */

		Scanner skaner = new Scanner(System.in);
		System.out.println("What is your name?");
		String imie = skaner.nextLine();
		System.out.println("Hi " + imie);
	}
}
