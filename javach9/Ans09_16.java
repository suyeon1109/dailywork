import java.util.Scanner;

public class Ans09_16 {
	static String seasonof(int a) {
		switch (a) {
			case 12: return "�ܿ�";
			case 1:
			case 2:
			case 3: return "��";
			case 4:
			case 5:
			case 6: return "����";
			case 7:
			case 8:
			default: return "����";
		}
	}
		
	public static void main(String[] args) {
		int month;
		Scanner s = new Scanner(System.in);
		
		do {
			System.out.print("�� ���Դϱ�(1~12): ");
			month = s.nextInt();
		} while (month>12 || month<1);
		
		System.out.printf("%s���� ������ %s�Դϴ�.\n", month,seasonof(month));
		s.close();
	}
}