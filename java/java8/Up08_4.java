import java.util.Scanner;
import java.util.Random;


public class Up08_4 {
	public static void main(String[] args) {
		Random random = new Random();
		Scanner s = new Scanner(System.in);
		int count=1, ball=0,strike=0,input=0;
		int ans=random.nextInt();
		// int []com=new int[3];
		
		while (true) {
			while (true) {
				System.out.printf("%dȸ �����Դϴ�...\n3�ڸ� ���ڸ� �Է��ϼ���(ù�ڸ� 0����): ",count);
				input=s.nextInt();
				if (input>=100 && input<=999) {
					break;
				}
				System.out.println("���ڸ� �߸� �Է��Ͽ����ϴ�.");
			}
			/*for (int k=100;k>=1000;k/=10) {
				for (int j=10;j<=1000;j*=10) {
					if (input/k==ans/j) {
						if (k!=j) ball++;
						else strike++;
					}
				}
			
			
			input/100        100�� �ڸ�
			(input/10)%10    10�� �ڸ�
			(input%100)/10
			input%10         1�� �ڸ�
			}*/
			
			System.out.printf("�Է��Ͻ� %d��(��) %d��Ʈ���� %d���Դϴ�.\n", input,strike,ball); 
			count++;
		}
		
		

	}
}