import java.util.Scanner;

public class Ans06_27 {
    public static void main(String[] args) {
        int num;
        Scanner s = new Scanner(System.in);
        System.out.print("몇 단입니까? ");
        num = s.nextInt();

        for (int i=0;i< num;i++) {
            for (int j=1;j<num-i;j++) {
                System.out.print(" ");
            }
            for (int k=0;k<i*2+1;k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
