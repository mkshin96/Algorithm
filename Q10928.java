import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.security.MessageDigest;


public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-1");
            digest.reset();
            digest.update(s.getBytes("utf-8"));
            s = String.format("%040x" , new BigInteger(1, digest.digest()));
        } catch (Exception e){
            e.printStackTrace();
        }

        System.out.println(s);
    }
}
