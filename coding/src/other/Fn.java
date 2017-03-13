package other;
import java.util.Scanner;


public class Fn {

	public static void main(String[] args) {
		System.out.println(String.valueOf('a'));
		/*Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()){
			System.out.println(fn(scanner.nextInt()));
		}
		*/
	}

	private static int fn(int nextInt) {
		if (nextInt == 0 || nextInt == 1) {
			return nextInt;
		} else {
			return fn(nextInt-1)+fn(nextInt-2);
		}
	}


}
