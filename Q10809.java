import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int[] alpha = new int[26];
        char c[] = s.toCharArray();
        for(int i = 0; i < alpha.length; i++) alpha[i] = -1;

        for(int i = 0; i < c.length; i++){
            int temp = c[i] - 97;
            if(alpha[temp] == -1) alpha[temp] = i;
        }

        for(int i = 0; i < alpha.length; i++)
            System.out.print(alpha[i] + " ");
    }

}
