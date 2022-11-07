import java.util.Scanner;

public class Ans05_10 {
	public static void main(String[] args) {
		char ch;
		Scanner s = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ���: ");
		ch = s.next().charAt(0);
		
		switch (ch){
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				System.out.println("����");
				break;
			default:
				System.out.println("����");
		}
		
	}
}