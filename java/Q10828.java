import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {
		Stack<Integer> stack = new Stack<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());

		for (int i = 0; i < a; i++) {
			String s = br.readLine();

			if (s.contains("push"))
				stack.push(Integer.parseInt(s.split("\\s+")[1]));
			else if (s.contains("pop")) {
				if (stack.isEmpty()) {
					System.out.println(-1);

				} else
					System.out.println(stack.pop());
			} else if (s.contains("size"))
				System.out.println(stack.size());
			else if (s.contains("empty")) {
				if (stack.empty())
					System.out.println(1);
				else
					System.out.println(0);
			} else if (s.contains("top")) {
				if (stack.isEmpty()) {
					System.out.println(-1);

				} else {
					int b = stack.pop();
					System.out.println(b);
					stack.push(b);
				}
			}
		}

	}

}
