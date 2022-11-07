import java.util.Scanner;

public class Ans09_2 {
	public static void main(String[] args) {
		String str;
		Scanner s = new Scanner(System.in);
		System.out.print("도메인 입력: ");
		str = s.nextLine();
		
		if (str.endsWith(".kr")) {
			System.out.print("한국 도메인 입니다.");
		}
		else {
			System.out.print("한국 도메인이 아닙니다.");
		}
	}
}