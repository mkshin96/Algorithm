import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a[] = new int[3];

        for(int i = 0; i < a.length; i++) a[i] = sc.nextInt();

        int max = 0;
        int secondMax = 0;

        for(int i = 0; i < a.length; i++){
            if(max <= a[i]) {
                secondMax = max;
                max = a[i];
            }
            else if (a[i] <= max && a[i] >= secondMax) secondMax = a[i];
        }

        System.out.println(secondMax);
    }


}
