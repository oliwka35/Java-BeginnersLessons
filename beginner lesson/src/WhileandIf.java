
public class WhileandIf {
	public static void main(String[] args) {
		int value = 0;
		while (true) {
			System.out.println(value + "<10");
			if (value == 9) {
				System.out.println("done");
				break;
			}
			value++;
		}
	}
}
