import java.util.Scanner;

public class Ans09_19 {
	
	static void answer(int i, int num1, int num2) {
		int ans;
		while (true) {
			Scanner s = new Scanner(System.in);
			System.out.printf("[문제 %d] %d + %d = ",i,num1,num2);
			ans = s.nextInt();
			if (ans==num1+num2) {
				System.out.println("정답입니다.");
				break;
			}
			System.out.println("오답입니다.");
		}
	}
	
	static void plusquiz(int count) {
		Scanner s = new Scanner(System.in);
		int num1,num2;
		for (int i=1;i<=count;i++) {
			System.out.print("첫번째 숫자를 입력하십시오: ");
			num1 = s.nextInt();
			System.out.print("두번째 숫자를 입력하십시오: ");
			num2 = s.nextInt();
			answer(i,num1,num2);
		}
	}
		
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int count;
		System.out.print("몇 문제에 도전하시겠습니까?: ");
		count=s.nextInt();
		plusquiz(count);
	}
}