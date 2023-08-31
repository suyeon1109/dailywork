import java.util.Scanner;

public class Ans05_12 {
    public static void main(String[] args) {
        int f, sn;
        Scanner s = new Scanner(System.in);
        System.out.print("첫 번째 정수입력: ");
        f = s.nextInt();
        System.out.print("두 번째 정수입력: ");
        sn = s.nextInt();

        if (sn!=0) {
            System.out.printf("결과값은: %f", (double)f/sn);
        } //엥 아니 왜 에러나는지 모르겠음;;

        else {
            System.out.println("0으로 나누는 것은 불가능합니다.");
            } 

    }
}
