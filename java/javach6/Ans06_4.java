import java.util.Scanner;

public class Ans06_4 {
	public static void main(String[] args) {
		int start,end,sum=0;
		Scanner s = new Scanner(System.in);
		System.out.print("���ۼ�: ");
		start = s.nextInt();
		System.out.print("����: ");
		end = s.nextInt();
		
		for (int i=start; i<=end; i++) {
			sum+=i;
		}
		System.out.printf("sum = %d", sum);
	}
}