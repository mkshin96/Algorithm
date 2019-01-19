import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        for(int i=0;i<a;i++){
            BigInteger b = sc.nextBigInteger();
            BigInteger c = b.remainder(BigInteger.valueOf(2));
            BigInteger d = new BigInteger("0");
            if(c.equals(d)){
                System.out.println("even");
            }
            else
                System.out.println("odd");
        }
    }
}
