import java.util.Scanner;

public class Ans05_13 {
    public static void main(String[] args) {
        int f, sn, ans;
        Scanner s = new Scanner(System.in);
        System.out.print("첫 번째 수: ");
        f = s.nextInt();
        System.out.print("두 번째 수: ");
        sn = s.nextInt();

        System.out.printf("%d + %d = : ", f,sn);
        ans = s.nextInt();

        if (ans==f+sn) {
            System.out.print("정답");
        } 

        else {
            System.out.printf("오답! \n정답은 %d", f+sn);
            } 
    }
}
