import java.util.Scanner;

public class Ans05_8 {
    public static void main(String[] args) {
        int age, height;
        Scanner s = new Scanner(System.in);
        System.out.print("나이: ");
        age = s.nextInt();
        System.out.print("키: ");
        height = s.nextInt();

        if (age>=8 && height>=100) {
            System.out.println("놀이기구를 탈 수 있습니다.");
        }
        else {
            System.out.println("더 크면 오세요.");
        }
    }
}
