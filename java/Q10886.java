import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int[] b = new int[a];
        int cute = 0, nCute = 0;

        for(int i = 0; i < b.length; i++) b[i] = sc.nextInt();

        for(int i = 0; i < b.length; i++){
            if(b[i] == 1) cute++;
            else nCute++;
        }

        if(cute > nCute) System.out.println("Junhee is cute!");
        else System.out.println("Junhee is not cute!");
    }

}
