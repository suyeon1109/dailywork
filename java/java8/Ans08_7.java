import java.util.Scanner;

public class Ans08_7 {
	public static void main(String[] args){
		int a[] = {22,57,11,32,91,32,70}, b;
		Scanner s = new Scanner(System.in);
		
		System.out.print("ã�� ���ڸ� �Է��ϼ���: ");
		b = s.nextInt();
		
		for (int i=a.length-1;i>=0;i--) {
			if (a[i]==b){
				System.out.printf("�� ���� a[%d]�� �ֽ��ϴ�.",i);
				break;
			}
			System.out.print("�ش� ���� �������� �ʽ��ϴ�.");
			break;
		}
	}
}