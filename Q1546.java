import java.io.*;
import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int max = 0;
        double sum = 0;
        double[] b = new double[a];

        for(int i = 0; i < b.length; i++){
            b[i] = sc.nextInt();
            if(b[i] > max) max = (int)b[i];
        }

        for(int i = 0; i < b.length; i++){
            b[i] = b[i] / (double)max * 100;
        }

        for(int i = 0; i < b.length; i++){
            sum += b[i];
        }

        System.out.println(sum/(double)a);
    }


}
