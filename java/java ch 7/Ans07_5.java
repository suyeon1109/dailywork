import java.util.Scanner;
public class Ans07_5 {
	public static void main(String[] args) {
		int num,end=0;
	
		while (end==0) {
			Scanner s = new Scanner(System.in);
			System.out.print("������ �Է����ּ���: ");
			num=s.nextInt();
		
			if (num%10==0) {
				System.out.printf("%d�� 10���� ���������ϴ�.\n",num);
			}
			else {
				System.out.printf("%d�� 10���� ���������� �ʽ��ϴ�.\n",num);
			}
			
			System.out.print("�ѹ� ��? [yes ...0/no ...any]");
			end=s.nextInt();
		
		}
		
		
	}
}