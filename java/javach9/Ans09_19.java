import java.util.Scanner;

public class Ans09_19 {
	
	static void answer(int i, int num1, int num2) {
		int ans;
		while (true) {
			Scanner s = new Scanner(System.in);
			System.out.printf("[���� %d] %d + %d = ",i,num1,num2);
			ans = s.nextInt();
			if (ans==num1+num2) {
				System.out.println("�����Դϴ�.");
				break;
			}
			System.out.println("�����Դϴ�.");
		}
	}
	
	static void plusquiz(int count) {
		Scanner s = new Scanner(System.in);
		int num1,num2;
		for (int i=1;i<=count;i++) {
			System.out.print("ù��° ���ڸ� �Է��Ͻʽÿ�: ");
			num1 = s.nextInt();
			System.out.print("�ι�° ���ڸ� �Է��Ͻʽÿ�: ");
			num2 = s.nextInt();
			answer(i,num1,num2);
		}
	}
		
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int count;
		System.out.print("�� ������ �����Ͻðڽ��ϱ�?: ");
		count=s.nextInt();
		plusquiz(count);
	}
}