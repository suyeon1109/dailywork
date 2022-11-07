import java.util.Scanner;

public class Up07_7 {
	public static void main(String[] args) {
		int num,rev=0;

        Scanner s = new Scanner(System.in);
        System.out.print("숫자를 여러개 입력: ");
        num=s.nextInt();

        while (num>0) {
            rev=rev*10+num%10;
            num /= 10;
        }

        while (rev>0) {
            for (int i=1;i<=rev%10;i++) {
                System.out.print("*");
            }
            System.out.println();
            System.out.println();

            rev-=(rev%10);
            rev/=10;
        }
    }
}