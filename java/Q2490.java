import java.util.Scanner;

public class Q2490 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        for (int a = 0; a < 3; a++) {
            int cou = 0;
            int[] s = new int[4];
            for (int i = 0; i < s.length; i++) {
                s[i] = sc.nextInt();
                if (s[i] == 1) {
                    cou++;
                }
            }
            if (cou == 4)
                System.out.println("E");
            else if (cou == 3)
                System.out.println("A");
            else if (cou == 2)
                System.out.println("B");
            else if (cou == 1)
                System.out.println("C");
            else if (cou == 0)
                System.out.println("D");
        }
    }
}
