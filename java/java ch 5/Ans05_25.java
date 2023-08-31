import java.util.Scanner;

public class Ans05_25 {
    public static void main(String[] args) {
        char alph;
        Scanner s = new Scanner(System.in);
        System.out.print("문자를 입력하시오: ");
        alph = s.next().charAt(0);

        if (alph >= 65 && alph <= 90) {
            System.out.printf("%c는 대문자입니다.", alph);
        }
        else if (alph >= 97 && alph <= 122) {
            System.out.printf("%c는 소문자입니다.", alph);
        }
        else {
            System.out.print("잘못된 값을 입력하셨습니다.");
        }

    }
}
