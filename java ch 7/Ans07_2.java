import java.util.Scanner;
public class Ans07_2 {
	public static void main(String[] args) {
		int num;
		Scanner s = new Scanner(System.in);
		System.out.print("������ �Է����ּ���");
		num=s.nextInt();
		
		while (num>=0) {
			System.out.printf("%d  ", num);
			num--;
		}
		
	}
}