import java.util.Scanner;

public class Ans05_1 {
	public static void main(String[] args) {
		int score;
		System.out.print("�����Է�: ");
		Scanner s = new Scanner(System.in);
		score = s.nextInt();
		
		if (score>=80) {
			System.out.println("�հ�");
		}
		else {
			System.out.println("���հ�");
		}
	}
}