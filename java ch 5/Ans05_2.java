import java.util.Scanner;

public class Ans05_2 {
	public static void main(String[] args) {
		int num;
		System.out.print("정수 입력: ");
		Scanner s = new Scanner(System.in);
		num = s.nextInt();
		
		if (num>=0) {
			System.out.println("입력한 수는 + 입니다.");
		}
		
		else {
			System.out.println("입력한 수는 - 입니다.");
		}
	}
}