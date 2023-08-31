import java.util.Scanner;
import java.util.Random;

public class Ans09_17 {
	static int myrandom(int min, int max) {
		int random =(int) ((Math.random() * (max - min)) + min);
		return random;
	}
		
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("하한값: ");
		int min = s.nextInt();
		System.out.print("상한값: ");
		int max = s.nextInt();
		System.out.printf("생성한 난수는 %d입니다.\n", myrandom(min,max));
	}
}