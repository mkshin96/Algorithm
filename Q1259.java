import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            String n = sc.nextLine();
            if(n.equals("0")) break;
            boolean b = pal(n);
            if(b) System.out.println("yes");
            else System.out.println("no");
        }
    }

    public static boolean pal(String n){
        int mid = n.length()/2;
        for(int i = 0; i < mid; i++){
            if(n.charAt(i) != n.charAt(n.length()-1-i)) return false;
        }
        return true;
    }


}
