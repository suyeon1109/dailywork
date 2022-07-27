import java.util.Scanner;

public class Ans05_10 {
	public static void main(String[] args) {
		char ch;
		Scanner s = new Scanner(System.in);
		System.out.print("문자를 입력하세요: ");
		ch = s.next().charAt(0);
		
		switch (ch){
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				System.out.println("모음");
				break;
			default:
				System.out.println("자음");
		}
		
	}
}