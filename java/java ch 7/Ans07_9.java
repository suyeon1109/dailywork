import java.util.Scanner;
public class Ans07_9 {
	public static void main(String[] args) {
		int num,q;
		Scanner s = new Scanner(System.in);

		
		do {
			System.out.print("������ �Է����ּ���: ");
			num=s.nextInt();			
			if (num<0) {
				System.out.printf("%d=>����\n",num);
			}
			
			else {
				System.out.printf("%d=>���\n",num);
			}
			
			System.out.print("�ٽ� �ѹ�(1-Yes/any-no): ");
			q=s.nextInt();
			
		}while (q==1);
		
	}
}