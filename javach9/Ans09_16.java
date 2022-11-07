import java.util.Scanner;

public class Ans09_16 {
	static String seasonof(int a) {
		switch (a) {
			case 12: return "겨울";
			case 1:
			case 2:
			case 3: return "봄";
			case 4:
			case 5:
			case 6: return "여름";
			case 7:
			case 8:
			default: return "가을";
		}
	}
		
	public static void main(String[] args) {
		int month;
		Scanner s = new Scanner(System.in);
		
		do {
			System.out.print("몇 월입니까(1~12): ");
			month = s.nextInt();
		} while (month>12 || month<1);
		
		System.out.printf("%s월의 계절은 %s입니다.\n", month,seasonof(month));
		s.close();
	}
}