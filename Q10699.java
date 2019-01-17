import java.text.SimpleDateFormat;
import java.util.Date;



public class Main {
    public static void main(String[] args) {
        Date date = new Date();

        SimpleDateFormat sdFormat = new SimpleDateFormat("YYYY-MM-dd");

        String today = sdFormat.format(date);

        System.out.println(today);



    }
}
