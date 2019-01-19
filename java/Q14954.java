import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        boolean d = happy(s);

        if (d)
            System.out.println("HAPPY");
        else
            System.out.println("UNHAPPY");


    }

    public static boolean happy(String str) {
        int a = 0;

        for (int j = 0; j < str.length(); j++) {
            a = a + ((str.charAt(j) - 48) * (str.charAt(j) - 48));
        }

        if (a == 1) {
            return true;
        }
        if (a == Integer.parseInt(str) || a == 4) {
            return false;
        }

        str = String.valueOf(a);

        return happy(str);
    }
}
