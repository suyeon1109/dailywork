import java.util.Scanner;

public class Ans05_6 {
    public static void main(String[] args) {
        int age;
        Scanner s = new Scanner(System.in);
        System.out.print("나이: ");
        age = s.nextInt();

        if (age<19) {
            System.out.println("애들은 가라.");
        }
        else if (age<25) {
            System.out.println("대학생입니다.");
        }
        else {
            System.out.println("어서오세요.");
        }
    }
}
