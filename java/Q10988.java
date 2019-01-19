import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        boolean b = palendrome(str);

        if(b)
            System.out.println(1);
        else
            System.out.println(0);
    }

    public static boolean palendrome(String s){
        int last = s.length()-1;
        int center = s.length()/2;

        for(int i = 0; i < center; i++){
            if(s.charAt(i) != s.charAt(last-i)){
                return false;
            }
        }
        return true;
    }
}
