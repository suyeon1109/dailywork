import java.util.Scanner;

public class Ans05_3 {
	public static void main(String[] args) {
		int num;
		Scanner s = new Scanner(System.in);
		System.out.print("���� �Է�: ");
		num = s.nextInt();
		
		if (num%5==0) {
			System.out.println("5�� ���");
		}
		else {
			System.out.println("5�� ��� �ƴ�");
		}
	}
}