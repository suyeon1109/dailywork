import java.util.Scanner;

public class Ans05_23 {
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

        switch (op) {
            case 'm':
            case 'M':
                System.out.printf("%d * %d = %d", a,b,a*b);
                break;
            case 's':
            case 'S':
                System.out.printf("%d - %d = %d", a,b,a-b);
                break;
            case 'a':
            case 'A':
                System.out.printf("%d + %d = %d", a,b,a+b);
                break;
            case 'd':
            case 'D':
                if (b==0) {
                    System.out.print("0으로 나눌 수 없습니다");
                }
                else {
                    System.out.printf("%d / %d = %.2f", a,b, (float)a/b);
                } // /연산자 쓸때마다 에러나서 여기는 테스트 불가
                break;

        }

    }
}
