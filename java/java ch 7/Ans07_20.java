import java.util.Scanner;

public class Ans07_20 {
	public static void main(String[] args) {
		int a,b,ans;
        Scanner s = new Scanner(System.in);
        System.out.print("첫번째 숫자를 입력하세요: ");
        a=s.nextInt();
        System.out.print("두번째 숫자를 입력하세요: ");
        b=s.nextInt();

        while (true) {
            System.out.printf("%d + %d =",a,b);
            ans=s.nextInt();
            
            if (ans==a+b) {
                System.out.print("정답입니다");
                break;
            }

            else {
                System.out.print("오답입니다\n");
            }

        }
		
	}
}