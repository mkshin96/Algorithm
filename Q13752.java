import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int[] b = new int[a];

        for(int i = 0; i < b.length; i++) b[i] = sc.nextInt();

        for(int i = 0; i < b.length; i++){
            for(int j = 0; j < b[i]; j++){
                System.out.print("=");
            }
            System.out.println();
        }
    }

}
