import java.util.Scanner;
public class Ans07_7 {
	public static void main(String[] args) {
		int num,i=1;
		Scanner s = new Scanner(System.in);
		System.out.print("������ �Է����ּ���: ");
		num=s.nextInt();
		
		while (i<=num) {
			System.out.printf("%d  ",i%10);
			i++;
		}
		
	}
}