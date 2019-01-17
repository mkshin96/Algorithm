
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		long b[] = new long[a];

		b[0] = 1;

		if (a != 1) {
			b[1] = 3;

			for (int i = 2; i < b.length; i++) {
				b[i] = (b[i - 1] + b[i - 2] + b[i-2]) % 10007;

			}
		}

		System.out.println(b[a-1]);

	}

}
