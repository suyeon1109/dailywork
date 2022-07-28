import java.util.Scanner;

public class Ans05_14 {
    public static void main(String[] args) {
        int f, sn, th;
        Scanner s = new Scanner(System.in);
        System.out.print("과목1 점수(0-100): ");
        f = s.nextInt();
        System.out.print("과목2 점수(0-100): ");
        sn = s.nextInt();
        System.out.printf("과목3 점수(0-100)", f,sn);
        th = s.nextInt();

        if ((f+sn+th)/(float)3 >= 60 && f>=40 && sn>=40 && th>=40) {
            System.out.print("합격");
        } 

        else {
            System.out.printf("불합격");
            } 
    }
}
