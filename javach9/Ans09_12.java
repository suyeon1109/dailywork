import java.util.Scanner;

public class Ans09_12 {
	static void char_prn(char a, int b) {
		for (int i=0;i<b;i++) {
			System.out.print(a);
		}
	}
	
	public static void main(String[] args) {
		int num;
		char ch;
		Scanner s = new Scanner(System.in);
		
		System.out.print("문자: ");
		ch = s.next().charAt(0);
		System.out.print("숫자: ");
		num = s.nextInt();
		
		char_prn(ch,num);
	}
}