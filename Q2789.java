import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s2 = "";

        s2 = s.toUpperCase();

        s2 = s.replace("C", "");
        String s3 = s2.replace("A", "");
        String s4 = s3.replace("M", "");
        String s5 = s4.replace("B", "");
        String s6 = s5.replace("R", "");
        String s7 = s6.replace("I", "");
        String s8 = s7.replace("D", "");
        String s9 = s8.replace("G", "");
        String s10 = s9.replace("E", "");

        System.out.println(s10);
    }
}
