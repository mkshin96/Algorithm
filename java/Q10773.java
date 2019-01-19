import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> zero = new Stack<>();
        int a = sc.nextInt();
        int b = 0;
        int c = 0;
        for(int i = 0; i < a; i++) {
            c = sc.nextInt();
            zero.push(c);
            if(zero.peek() == 0) {
                zero.pop();
                zero.pop();
            }

        }

        while(!zero.isEmpty()) b = b+zero.pop();

        System.out.println(b);
    }
}
