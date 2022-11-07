import java.util.Scanner;

public class Ans06_3 {
	public static void main(String[] args) {
		int num;
		Scanner s = new Scanner(System.in);
		System.out.print("정수를 입력헤주세요: ");
		num = s.nextInt();
		
		for (int i=1; i<=num; i++) {
			System.out.printf(" %d", i%10);
		}
	}
}