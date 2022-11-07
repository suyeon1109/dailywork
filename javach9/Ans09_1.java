import java.util.Scanner;

public class Ans09_1 {
	public static void main(String[] args) {
		String str,strAry[];
		Scanner s = new Scanner(System.in);
		System.out.print("문자열 입력 ==> ");
		str = s.nextLine();
		strAry = str.split("");
		
		for (int i=0;i<str.length();i++) {
			System.out.printf("%c",str.charAt(i)+1);
		}
	}
}