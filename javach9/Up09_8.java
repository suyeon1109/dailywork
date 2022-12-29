import java.util.Scanner;
import java.util.Random;

public class Up09_8 {
	static Scanner s = new Scanner(System.in);
	static String[] dayKor = {"일","월","화","수","목","금","토"};
	static String[] dayEng = {"sunday","monday","tuesday","wednesday","thursday","friday","saturday"};
	static int last=8, day;
	
	static void question() {
		Random rand = new Random();
		do {
			day=rand.nextInt(7); // 표시할 요일 0~6 난수
		} while (day==last); // 동일 요일을 연속해서 표시 안함
		
		last = day; // last 이전 요일의 난수
	}
	
	static void answer() {
		int action;
		
		do {
			System.out.print(dayKor[day]+"요일: ");
			String str = s.next();
			if (dayEng[day].equals(str)) {
				System.out.println("정답입니다.");
				break;
			}
			
			System.out.println("틀렸습니다.");
			System.out.print("어떻게 할까요? 1..재입력 0..정답보기: ");
			action = s.nextInt();
			
			if (action==0) {
				System.out.printf("%s요일은 %s입니다.\n", dayKor[day], dayEng[day]);
			}
		} while (action==1);
	}
	
	
	public static void main(String[] args) {
		System.out.println("요일명을 영어로 입력하시오.");
		int retry;
		
		do {
			question();
			answer();
			System.out.print("다시 한 번? 1..Yes / 0..No: ");
			retry = s.nextInt();
		} while (retry!=1);
	}
		
}