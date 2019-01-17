import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);
        int b = 0;
        int a = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();

        if(s.length() > a && s.length() < a) return ;

        for(int i = 0; i < s.length(); i++) b = b + s.charAt(i) - '0';

        System.out.println(b);



    }
}
