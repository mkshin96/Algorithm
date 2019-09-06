import java.util.Arrays;
import java.util.Scanner;

public class Q2217 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] lope = new int[N];
        int weight = 0;
        for (int i = 0; i < N; i++){
            lope[i] = sc.nextInt();
        }

        Arrays.sort(lope);

        weight = lope[0] * N;
        for (int i = 1; i < lope.length; i++){
            if(weight < (lope[i] * (N-i))) weight = lope[i] * (N-i);
        }

        System.out.println(weight);
    }
}
