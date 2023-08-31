import java.util.Scanner;

public class Ans04_07 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("첫번째 계산할 값을 입력하시오:");
        b=s.nextInt();
        System.out.print("두번째 계산할 값을 입력하시오:");
        c=s.nextInt();

        System.out.printf("%d + %d = %d \n", b,c,b+c);
        System.out.printf("%d - %d = %d \n", b,c,b-c);
        System.out.printf("%d * %d = %d \n", b,c,b*c);
        System.out.printf("%d / %d = %f \n", b,c,(float)b/c);
        System.out.printf("%d % %d = %d \n", b,c,b%c);
    }
}
