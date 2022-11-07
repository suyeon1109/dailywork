import java.util.Scanner;

public class Ans05_24 {
    public static void main(String[] args) {
        char alph;
        Scanner s = new Scanner(System.in);
        System.out.print("문자를 입력하시오: ");
        alph = s.next().charAt(0);

        if (alph >= 65 && alph <= 90) {
            System.out.print("True");
        }
        else {
            System.out.print("False");
        }

    }
}
