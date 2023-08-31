import java.util.Scanner;

public class Ans06_7 {
	public static void main(String[] args) {
		int num;
		Scanner s = new Scanner(System.in);
		System.out.print("¸î ´Ü? ");
		num = s.nextInt();
		
		for (int i=1; i<=9; i++) {
			System.out.printf("%d x %d = %d \n", num,i,num*i);
		}
	}
}