import java.util.Scanner;

public class Ans05_1 {
	public static void main(String[] args) {
		int score;
		System.out.print("점수입력: ");
		Scanner s = new Scanner(System.in);
		score = s.nextInt();
		
		if (score>=80) {
			System.out.println("합격");
		}
		else {
			System.out.println("불합격");
		}
	}
}