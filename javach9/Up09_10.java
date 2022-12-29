import java.util.Scanner;
import java.util.Random;

public class Up09_10 {
	static Scanner s = new Scanner(System.in);
	static boolean retry() {
		do {
			System.out.print("�ٽ� �� ��? <Yes_1 / No_0>: ");
			int rtry=s.nextInt();
			if (rtry==1) {
				return true;
			} else {
				return false;
			}
		} while (true);
	}

	static void testing() {
		Random rand=new Random();
		int x =  (int)(Math.random()*(999-100)+100);
		int y =  (int)(Math.random()*(999-100)+100);
		int z =  (int)(Math.random()*(999-100)+100);
		int pattern = (int)(Math.random()*(4-1)+1);

		int answer, response;
		String xx=String.valueOf(x), yy=String.valueOf(y), zz=String.valueOf(z), question;
		switch (pattern) {
			case 1:
				question = xx+"+"+yy+"+"+zz+"=" ;
				answer = x+y+z;
				break;
			case 2:
				question = xx+"+"+yy+"-"+zz+"=" ;
				answer = x+y-z;
				break;
			case 3:
				question = xx+"-"+yy+"+"+zz+"=" ;
				answer = x-y+z;
				break;
			default:
				question = xx+"-"+yy+"-"+zz+"=" ;
				answer = x-y-z;
		}
		
		while (true) {
			System.out.print(question);
			response = s.nextInt();
			if (response==answer) {
				System.out.println("�¾ҽ��ϴ�.");
				break;
			} else {
				System.out.println("Ʋ�Ƚ��ϴ�.");
			}
		}
	}

	public static void main(String[] args) {
		System.out.print("�ϻ� �Ʒ�");
		do {
			testing();
			if ( !retry() ) break;
		} while (true);
	}
}