import java.util.Scanner;
import java.util.Random;

public class Up09_8 {
	static Scanner s = new Scanner(System.in);
	static String[] dayKor = {"��","��","ȭ","��","��","��","��"};
	static String[] dayEng = {"sunday","monday","tuesday","wednesday","thursday","friday","saturday"};
	static int last=8, day;
	
	static void question() {
		Random rand = new Random();
		do {
			day=rand.nextInt(7); // ǥ���� ���� 0~6 ����
		} while (day==last); // ���� ������ �����ؼ� ǥ�� ����
		
		last = day; // last ���� ������ ����
	}
	
	static void answer() {
		int action;
		
		do {
			System.out.print(dayKor[day]+"����: ");
			String str = s.next();
			if (dayEng[day].equals(str)) {
				System.out.println("�����Դϴ�.");
				break;
			}
			
			System.out.println("Ʋ�Ƚ��ϴ�.");
			System.out.print("��� �ұ��? 1..���Է� 0..���亸��: ");
			action = s.nextInt();
			
			if (action==0) {
				System.out.printf("%s������ %s�Դϴ�.\n", dayKor[day], dayEng[day]);
			}
		} while (action==1);
	}
	
	
	public static void main(String[] args) {
		System.out.println("���ϸ��� ����� �Է��Ͻÿ�.");
		int retry;
		
		do {
			question();
			answer();
			System.out.print("�ٽ� �� ��? 1..Yes / 0..No: ");
			retry = s.nextInt();
		} while (retry!=1);
	}
		
}