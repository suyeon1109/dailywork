import java.util.Scanner;

public class Ans06_6 {
	public static void main(String[] args) {
		int start,end,inc,sum=0;
		Scanner s = new Scanner(System.in);
		System.out.print("���۰� �Է�: ");
		start = s.nextInt();
		System.out.print("���� �Է�: ");
		end = s.nextInt();
		System.out.print("������ �Է�: ");
		inc = s.nextInt();
		
		for (int i=start; i<=end; i+=inc) {
			sum+=i;
		}
		System.out.printf("%d���� %d���� %d�� ������ ���� ��: %d",start,end,inc,sum);
	}
}