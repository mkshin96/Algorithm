import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        int[] b = new int[a];
        int[] c = new int[a];

        for(int i = 0; i < b.length; i++) b[i] = sc.nextInt();
        for(int i = 0; i < c.length; i++) c[i] = sc.nextInt();

        Arrays.sort(b);
        Arrays.sort(c);

        int d = 0;
        for(int i = 0; i < c.length; i++){
            d = d + (b[i] * c[c.length - 1 - i]);
        }

        System.out.println(d);
    }

}
