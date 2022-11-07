import java.util.Scanner;

public class Ans09_15 {
	static void change(char a) {
		if (a>='a' && a<='z') {
			System.out.printf("%c의 대문자는 %c\n",a,a-32);
		}
		else if (a>='A' && a<='Z') {
			System.out.printf("%c의 소문자는 %c\n",a,a+32);
		}
		else {
			System.out.print("잘못된 값을 입력하셨습니다.\n");
		}
	}
	
	public static void main(String[] args) {
		char alphabet;
		Scanner s = new Scanner(System.in);
		
		while (true) {
			System.out.print("문자입력(@:종료): ");
			alphabet = s. next().charAt(0);
			if (alphabet=='@') break;
			change(alphabet);

		}
	}
}