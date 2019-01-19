import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = 0;

        while(true){
            if(a % 5 == 0){
                System.out.println((a/5)+b);
                break;
            }
            else if(a <= 0){
                System.out.println(-1);
                break;
            }
            a = a - 3;
            b++;
        }

    }
}
