import java.util.Scanner;
public class Ans07_3 {
	public static void main(String[] args) {
		int start,end,num,sum=0;
		Scanner s = new Scanner(System.in);
		System.out.print("���۰� �Է� ");
		start=s.nextInt();
		System.out.print("���� �Է�");
		end=s.nextInt();
		System.out.print("������ �Է�");
		num=s.nextInt();
		
		while (start<=end) {
			sum+=start;
			//System.out.printf("%d  ", num);
			start+=num;
		}
		System.out.printf("%d���� %d���� %d�� ������ ���� ��: %d",start, end, num, sum);
		
	}
}