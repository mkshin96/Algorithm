import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int cnt = 0;
        String s2 = "";
        for(int i = 0; i < s.length(); i++){
            s2 = s2 + String.valueOf(s.charAt(i));
            cnt++;

            if(cnt % 10 == 0 || cnt == s.length()) {
                System.out.println(s2);
                s2 = "";
            }

        }

    }
}
