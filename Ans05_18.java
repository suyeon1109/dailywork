import java.util.Scanner;

public class Ans05_18 {
    public static void main(String[] args) {
        int start,end, num;
        
        Scanner s = new Scanner(System.in);
        System.out.print("범위 시작: ");
        start = s.nextInt();
        System.out.print("범위 끝: ");
        end = s.nextInt();
        System.out.print("숫자: ");
        num = s.nextInt();

        if (num>=start && num<=end) {
            System.out.println("OK");
        }
        else {
            System.out.println("NO");
        }
    }
}
