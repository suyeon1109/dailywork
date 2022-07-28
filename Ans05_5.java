import java.util.Scanner;

public class Ans05_5 {
    public static void main(String[] args) {
        int num;
        Scanner s = new Scanner(System.in);
        System.out.print("숫자입력: ");
        num=s.nextInt();

        if (num%2==0) {
            System.out.printf("%d는(은) 짝수입니다.", num);
        }
        else {
            System.out.printf("%d는(은) 홀수입니다.", num);
        }
    }
}
