import java.util.Scanner;

public class Ans08_13 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		char[]stack = new char[10];
		int top=0, select=9;
		char carName = 'A';
		
		while (select!=3) {
			System.out.printf("<1>�ڵ��� �ֱ� <2> �ڵ��� ���� <3> ��: ");
			select = s.nextInt();
			switch (select) {
				case 1:
					if (top>=10) {
						System.out.println("�ͳ��� �� ���� ���� �� ��");
					} else {
						stack[top] = carName++;
						System.out.printf("%c �ڵ����� �ͳο� ��\n", stack[top]);
						top++;
					}
					break;
				
				case 2:
					if (top<=0) {
						System.out.println("�������� �ڵ����� ����");
					} else {
						top--;
						System.out.printf("%c �ڵ����� �ͳο��� ����\n", stack[top]);
						stack[top] = ' ';
					}
					break;
				
				case 3:
					System.out.printf("���� �ͳο� %d�밡 ����\n", top);
					System.out.println("���α׷��� �����մϴ�.");
					break;
				default:
					System.out.println("�߸� �Է��߽��ϴ�. �ٽ� �Է��ϼ���.");
			}
		}
		s.close();
	}
}