
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		sc.nextLine();
		int count = 0;
		for (int i = 0; i < a; i++) {
			String s = sc.nextLine();
			for (int j = 0; j < s.length(); j++) {
				if(s.charAt(j) == '(') count += 1;
				else count -= 1;

				if(count < 0) {
					System.out.println("NO");
					break;
				}

			}
			if(count == 0) System.out.println("YES");
			if(count > 0)System.out.println("NO");
			count = 0;
		}

	}

}
