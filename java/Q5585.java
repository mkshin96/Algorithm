import java.util.Scanner;

public class Q5585 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pay = 1000 - sc.nextInt();
        int coin[] = {1, 5, 10, 50, 100, 500};

        int count = 0;

        for(int i = coin.length -1; i >= 0; i--){
           if(pay >= coin[i]){
                count += (pay / coin[i]);
                pay %= coin[i];
           }
        }

        System.out.println(count);

    }
}
