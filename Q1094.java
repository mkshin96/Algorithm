import java.util.*;

public class Main {
    public static void main(String[] args) {
        int n = 64;

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = 64;
        int count = 0;
        while(b > a) b = b / 2;

        while(true){
            if(a >= b){
                a = a - b;
                count++;
                if(b == 0 || a == 0) break;
            }
            else
                b = b / 2;
        }
        System.out.println(count);
    }


}
