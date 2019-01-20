import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] argv) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        int b[] = new int[a];
        int count = 0;
        for(int i = 0; i < a; i++) b[i] = Integer.parseInt(br.readLine());

        for(int i = b.length-1; i >=0; i--){
            if(b[i] == a) a--;
            else count++;
        }

        System.out.println(count);

    }
}
