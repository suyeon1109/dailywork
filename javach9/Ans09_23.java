import java.util.Scanner;

public class Ans09_23 {
	static int sumOf(int[] x) {
		int sum=0;
		for (int i=0;i<x.length;i++) {
			sum+=x[i];
		}
		return sum;
	}
		
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("��� ��: ");
		int num=s.nextInt();
		int[] x = new int [num];
			
		for (int i=0;i<num;i++) {
			System.out.print("x[" + i + "]: ");
			x[i] = s.nextInt();
		}
		System.out.printf("��� ����� ���� %d�Դϴ�\n",sumOf(x));
	}
}