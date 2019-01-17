import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine().trim();
        String[] words = str.split("\\s");
        int count = 0;
        if(str.isEmpty()){
            System.out.println(0);
        } else {
            for (int i = 0; i < words.length; i++) {
                count++;
            }

            System.out.println(count);
        }
    }
}
