import java.util.Scanner;

public class Ans09_3 {
	public static void main(String[] args) {
		String str;
		Scanner s = new Scanner(System.in);
		System.out.print("��ȭ��ȣ �Է�: ");
		str = s.nextLine();
		
		for (int i=0;i<str.length();i++) {
			if (str.charAt(i)=='-') {
			continue;
			}
			System.out.printf("����� ��ȭ��ȣ: %c",str.charAt(i));
		}
	}
}