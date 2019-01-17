import java.io.*;
import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int cnt = 0;


        while(cnt != a){
            double sum = 0;
            int b = sc.nextInt();
            int[] c = new int[b];
            int cnt2 = 0;
            double sum2 = 0;
            for(int i =0; i < c.length; i++){
                c[i] = sc.nextInt();
                sum += c[i];
            }

            sum = sum/(double)b;


            for(int i =0; i < c.length; i++){
                if(c[i] > sum) cnt2++;
            }

            sum2 = cnt2/(double)b * 100.0;

            System.out.println(String.format("%.3f", sum2) + "%");

            cnt++;
        }
    }


}
