import java.util.Scanner;
import java.util.Random;

public class Ans09_17 {
	static int myrandom(int min, int max) {
		int random =(int) ((Math.random() * (max - min)) + min);
		return random;
	}
		
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("���Ѱ�: ");
		int min = s.nextInt();
		System.out.print("���Ѱ�: ");
		int max = s.nextInt();
		System.out.printf("������ ������ %d�Դϴ�.\n", myrandom(min,max));
	}
}