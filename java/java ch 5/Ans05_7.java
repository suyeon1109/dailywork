import java.util.Scanner;

public class Ans05_7 {
    public static void main(String[] args) {
        int score;
        Scanner s = new Scanner(System.in);
        System.out.print("점수를 입력하세요(0~100점): ");
        score = s.nextInt();

        if (score>=90) {
            System.out.println("A입니다.");
        }
        else if (score>=80) {
            System.out.println("B입니다.");
        }
        else if (score>=70) {
            System.out.println("C입니다.");
        }
        else if (score>=60) {
            System.out.println("D입니다.");
        }
        else {
            System.out.println("또 만나요.....!!!!!");
        }
    }
}
