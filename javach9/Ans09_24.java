import java.util.Scanner;

public class Ans09_24 {
	static Scanner s = new Scanner(System.in);
	
	static int readPlusInt() {
		int num=0;
		while (num<=0) {
			System.out.print("양의 정수값: ");
			num = s.nextInt();
		}
		return num;
	}
	
	static void reverseInt(int n) {
		System.out.print("반대로 읽으면 ");
		while (n!=0) {
			System.out.print(n%10);
			n/=10;
		}
		System.out.print(" 입니다.\n");
	}
		
	public static void main(String[] args) {
		int x;
		
		do {
			int n=readPlusInt();
			reverseInt(n);
			
			do {
				System.out.print("다시 한 번(Yes:1, No:0): ");
				x = s.nextInt();
				if (x==1||x==0) break;
			} while (true);
			
			if (x==0) break;
		} while (true);
	}
}