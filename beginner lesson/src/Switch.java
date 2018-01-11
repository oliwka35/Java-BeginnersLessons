import java.util.Scanner;

public class Switch {
public static void main(String[] args) {
	Scanner skaner = new Scanner(System.in);
	System.out.println("Please enter a command:");
	String command = skaner.nextLine();
	
	switch(command){
	case "start":
		System.out.println("The machine started");
		break;
		
	case"stop":
		System.out.println("The machine stopped");
		break;
		
	default:
		System.out.println("Command not recognized");
	
	
	}
}
}
