import java.util.Scanner;

public class Ans09_15 {
	static void change(char a) {
		if (a>='a' && a<='z') {
			System.out.printf("%c�� �빮�ڴ� %c\n",a,a-32);
		}
		else if (a>='A' && a<='Z') {
			System.out.printf("%c�� �ҹ��ڴ� %c\n",a,a+32);
		}
		else {
			System.out.print("�߸��� ���� �Է��ϼ̽��ϴ�.\n");
		}
	}
	
	public static void main(String[] args) {
		char alphabet;
		Scanner s = new Scanner(System.in);
		
		while (true) {
			System.out.print("�����Է�(@:����): ");
			alphabet = s. next().charAt(0);
			if (alphabet=='@') break;
			change(alphabet);

		}
	}
}