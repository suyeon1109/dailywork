import java.util.Scanner;

public class Ans05_22 {
    public static void main(String[] args) {
        char op;
        int a,b;
        
        Scanner s = new Scanner(System.in);
        System.out.print("문자를 입력하세요: ");
        op = s.next().charAt(0);
        System.out.print("첫 번째 숫자: ");
        a = s.nextInt();
        System.out.print("두 번째 숫자: ");
        b = s.nextInt();

        if (op=='m' || op=='M') {
            System.out.printf("%d * %d = %d", a,b,a*b);
        }
        else if (op=='s' || op=='S') {
            System.out.printf("%d - %d = %d", a,b,a-b);
        }
        else if (op=='a' || op=='A') {
            System.out.printf("%d + %d = %d", a,b,a+b);
        }
        else if (op=='d' || op=='D') {
            if (b==0) {
                System.out.print("0으로 나눌 수 없습니다");
            }
            else {
                System.out.printf("%d / %d = %.2f", a,b,(float)a/b);
            } //왜 (float) 이나 (double) 은 계속 에러가 남? 
        }
    }
}
