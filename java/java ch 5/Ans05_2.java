import java.util.Scanner;

public class Ans05_2 {
	public static void main(String[] args) {
		int num;
		System.out.print("���� �Է�: ");
		Scanner s = new Scanner(System.in);
		num = s.nextInt();
		
		if (num>=0) {
			System.out.println("�Է��� ���� + �Դϴ�.");
		}
		
		else {
			System.out.println("�Է��� ���� - �Դϴ�.");
		}
	}
}