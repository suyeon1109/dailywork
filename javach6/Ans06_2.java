import java.util.Scanner;

public class Ans06_2 {
	public static void main(String[] args) {
		int num;
		Scanner s = new Scanner(System.in);
		System.out.print("양의 정수를 입력헤주세요: ");
		num = s.nextInt();
		
		if (num <0) {
			System.out.print("");
		}
		else {
		for (int i=1;i<=num;i++) {
			System.out.printf("%d  ", i);
		}
		}
	}
}