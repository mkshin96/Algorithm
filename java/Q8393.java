import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int b = 0;
        for(int a=0;a<=i;a++){
            b = a+b;
        }
        System.out.println(b);
    }
}
