import java.util.Scanner;

public class Ans09_14 {
	static void mtable(int a) {
		for (int i=1;i<=9;i++) {
			System.out.printf("%d X %d = %d\n", a,i,a*i);
		}
	}
	
	public static void main(String[] args) {
		int dan;
		Scanner s = new Scanner(System.in);
		
		System.out.print("  ¸î ´Ü ?  ");
		dan = s.nextInt();
		mtable(dan);
	}
}