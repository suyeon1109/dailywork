import java.util.Scanner;

public class Ans09_24 {
	static Scanner s = new Scanner(System.in);
	
	static int readPlusInt() {
		int num=0;
		while (num<=0) {
			System.out.print("���� ������: ");
			num = s.nextInt();
		}
		return num;
	}
	
	static void reverseInt(int n) {
		System.out.print("�ݴ�� ������ ");
		while (n!=0) {
			System.out.print(n%10);
			n/=10;
		}
		System.out.print(" �Դϴ�.\n");
	}
		
	public static void main(String[] args) {
		int x;
		
		do {
			int n=readPlusInt();
			reverseInt(n);
			
			do {
				System.out.print("�ٽ� �� ��(Yes:1, No:0): ");
				x = s.nextInt();
				if (x==1||x==0) break;
			} while (true);
			
			if (x==0) break;
		} while (true);
	}
}