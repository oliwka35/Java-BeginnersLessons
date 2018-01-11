import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {

		Scanner skaner = new Scanner(System.in);

		/*
		 * System.out.println("Enter a number"); int value = skaner.nextInt();
		 * while(value !=5){ System.out.println("Enter"); value =
		 * skaner.nextInt();
		 */
		int value = 0;
		do {
			System.out.println("Enter a number");
			value = skaner.nextInt();
		} 
		while (value != 5);

		System.out.println("Got 5!");
	}
}