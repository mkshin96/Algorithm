import java.util.Arrays;
import java.util.Scanner;

public class Q11399 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int answer = 0, n = sc.nextInt();
        int[] p = new int[n+1];

        for (int i = 1; i < n + 1; i++) p[i] = sc.nextInt();

        Arrays.sort(p);

        for (int i = 1; i < n + 1; i++){
            p[i] += p[i-1];
            answer += p[i];
        }

        System.out.println(answer);
    }
}
