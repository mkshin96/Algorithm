import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] b = new int[a];
        for(int i = 0; i < a; i++){
            b[i] = sc.nextInt();
        }

        Arrays.sort(b);

        for(int i = 0; i < a; i++){
            System.out.println(b[i]);
        }

    }
}
