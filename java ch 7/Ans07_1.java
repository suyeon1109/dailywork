import java.util.Scanner;
public class Ans07_1 {
	public static void main(String[] args) {
		int num,i=2;
		Scanner s = new Scanner(System.in);
		System.out.print("������ �Է����ּ���");
		num=s.nextInt();
		
		while (i<=num) {
			System.out.printf("%d  ", i);
			i+=2;
		}
		
	}
}