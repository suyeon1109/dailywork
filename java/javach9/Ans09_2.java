import java.util.Scanner;

public class Ans09_2 {
	public static void main(String[] args) {
		String str;
		Scanner s = new Scanner(System.in);
		System.out.print("������ �Է�: ");
		str = s.nextLine();
		
		if (str.endsWith(".kr")) {
			System.out.print("�ѱ� ������ �Դϴ�.");
		}
		else {
			System.out.print("�ѱ� �������� �ƴմϴ�.");
		}
	}
}