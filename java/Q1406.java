import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Character> left = new Stack<>();
		Stack<Character> right = new Stack<>();
		String s = br.readLine();

		for (int i = 0; i < s.length(); i++) {
			left.push(s.charAt(i));
		}
		int a = Integer.parseInt(br.readLine());
		for (int i = 0; i < a; i++) {
			s = br.readLine();
			if (s.equals("L")) {
				if(!left.isEmpty()) {
					right.push(left.pop());
				}
			}
			if (s.equals("D")) {
				if(!right.isEmpty()) {
					left.push(right.pop());
				}
			}

			if (s.equals("B")) {
				if(!left.isEmpty()) {
					left.pop();
				}
			}

			if (s.charAt(0) == 'P') {
				char s3 = s.charAt(2);
				left.push(s3);
			}
		}

		while(!left.isEmpty()) right.push(left.pop());
		while(!right.isEmpty()) System.out.print(right.pop());
	}

}
