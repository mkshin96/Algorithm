import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        String s = sc.nextLine();
        String[] s2 = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        for(int i = 0; i < s2.length; i++){
            if(s.contains(s2[i])){
                s = s.replaceAll(s2[i], "!");
            }
        }

        System.out.println(s.length());
    }
}
