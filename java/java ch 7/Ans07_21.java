import java.util.Scanner;

public class Ans07_21 {
	public static void main(String[] args) {
		int a,b,ans,count;
        Scanner s = new Scanner(System.in);
        System.out.print("몇 문제에 도전하시겠습니까? : ");
        count=s.nextInt();

        for (int i=1;i<=count;i++) {
            System.out.print("첫번째 숫자를 입력하세요: ");
            a=s.nextInt();
            System.out.print("두번째 숫자를 입력하세요: ");
            b=s.nextInt();

            while (true) {
                System.out.printf("[문제 %d]%d + %d = ",i,a,b);
                ans=s.nextInt();
                
                if (ans==a+b) {
                    System.out.print("정답입니다\n");
                    break;
                }

                else {
                    System.out.print("오답입니다\n");
                }

            }
        }

		
	}
}