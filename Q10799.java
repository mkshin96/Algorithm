import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();
		Stack<Character> stack = new Stack<>();
		int sum = 0;

		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == '(') stack.push('(');
			else {
				stack.pop();
				if(s.charAt(i-1) == '(') sum += stack.size();
				else sum += 1;
			}
		}

		System.out.println(sum);
	}

}
