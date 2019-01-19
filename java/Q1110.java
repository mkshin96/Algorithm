import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int answer = sc.nextInt();
        int count = 0;
        int temp2 = answer;
        while(true){
            int ten = answer / 10;
            int one = answer % 10;
            int temp = ten + one;
            int temp1 = (one * 10) + (temp % 10);
            count++;
            answer = temp1;

            if(temp1 == temp2){
                System.out.println(count);
                break;
            }

        }

    }
}
