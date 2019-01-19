import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] b = new int[a];

        for(int i = 0; i < b.length; i++) b[i] = sc.nextInt();
        mergeSort(b, 0, b.length-1);

        for(int i = 0; i < b.length; i++) System.out.println(b[i]);

    }

    public static void mergeSort(int[] b, int low, int high){
        if(low == high) return;

        int m = (low + high) /2;

        mergeSort(b, low, m);
        mergeSort(b, m+1, high);
        mergeArray(b, low, m, m+1, high);
    }

    public static void mergeArray(int[] v, int left1, int right1, int left2, int right2){
        int v2[] = new int[right2 - left1+1];

        int i = left1, j = left2, k = 0;

        while(i <= right1 && j <= right2) v2[k++] = (v[i] > v[j])? v[j++] : v[i++];
        while(i <= right1) v2[k++] = v[i++];
        while(j <= right2) v2[k++] = v[j++];

        i = 0;
        k = left1;

        while(i < v2.length) v[k++] = v2[i++];
    }
}
