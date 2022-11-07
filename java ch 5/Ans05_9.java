import java.util.Scanner;

public class Ans05_9 {
    public static void main(String[] args) {
        int gender, age;
        Scanner s = new Scanner(System.in);
        System.out.print("성별(남자:M, 여자:F): ");
        gender = s.next().charAt(0);
        System.out.print("나이: ");
        age = s.nextInt();

        if (gender=='M') {
            if (age>=19) {
                System.out.println("성인 남자입니다.");
            }
            else {
                System.out.println("소년입니다.");
            }
        }

        else {
            if (age>=19) {
                System.out.println("성인 여자입니다.");
            }
            else {
                System.out.println("소녀입니다.");
            }
        }
    }
}
