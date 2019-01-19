import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int d = Integer.parseInt(br.readLine());
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            for (int i = 0; i < d; i++) {
                String str = br.readLine();
                StringTokenizer st = new StringTokenizer(str);
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());

                int c = a + b;

                bw.write(c + "\n");

            }

            bw.flush();
            bw.close();
        } catch (IOException e) {

            System.out.println(e.toString());

        }
    }


}
