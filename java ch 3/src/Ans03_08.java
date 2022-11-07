import java.util.Scanner;

public class Ans03_08 {
    public static void main(String[] args) {
        int f,sn,t;
        Scanner s = new Scanner(System.in);
        System.out.print("첫번째 학생의 성적:");
        f=s.nextInt();
        System.out.print("두번째 학생의 성적:");
        sn=s.nextInt();
        System.out.print("세번째 학생의 성적:");
        t=s.nextInt();

        System.out.printf("총점: %d", f+sn+t);
    }
}
