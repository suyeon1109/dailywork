import java.util.Scanner;

public class Up06_2 {
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
                System.out.printf("%c",65+k);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

        for (int i=0;i<= num;i++) {
            for (int j=1;j<=i;j++) {
                System.out.print(" ");
            }
            int p=0;
            for (int k=(num-i)*2-1;k>=1;k--) {
                
                System.out.printf("%c",90-p); //다 z부터 시작하는건 어떻ㄱㅔ 할지 모르겠음
                p++;
            }
            System.out.println();
        }
    }
}