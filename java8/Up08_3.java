import java.util.Scanner;

public class Up08_3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int len=0,com;
		char car='A';
		char []queue=new char[5];
		
		while (true) {
			System.out.print("<1> �ֱ�  <2> ����  <3> ��: ");
			com = s.nextInt();
			
			if (com==3) {
				System.out.printf("���� ť�� %d�� ���� ==>\n", len+1);
				System.out.println("���α׷� ����");
				break;
			}
			else if (com==1) {
				if (len==5) {
					System.out.println("ť ����");
					// len=4;
					continue;
				}
				queue[len]=car;
				System.out.printf("%c ��\n",car++);
				len++;
			}
			else if (com==2) {
				if (len==0) {
					System.out.println("ť �����");
					continue;
				}
				// queue[len]=car;
				System.out.printf("%c ����\n",car);
				len--;
			}
			else System.out.println("�߸� �Է��߽��ϴ�");
			System.out.printf("���� ť�� %d�� ���� ==>", len);
			for (int i=0;i<len;i++) {
				System.out.printf("%3c",queue[i]);
			}
			System.out.println();
		}

	}
}