import java.util.Scanner;

public class Ans05_11 {
    public static void main(String[] args) {
        int stand, val;
        Scanner s = new Scanner(System.in);
        System.out.print("기준값: ");
        stand = s.nextInt();
        System.out.print("비교값: ");
        val = s.nextInt();

        if (stand==val) {
            System.out.printf("%d이다.", val);
        }

        else {
            if (stand>val) {
                System.out.printf("%d보다 작다.", stand);
            }
            else {
                System.out.printf("%d보다 크다.", stand);
            }
        }
    }
}
