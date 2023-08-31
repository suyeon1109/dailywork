import java.util.Scanner;

public class Up09_6 {
	static Scanner s = new Scanner(System.in);
	
	static void arrayCreate (int [][] a, int height) {
		for (int i=0;i< height; i++) {
			System.out.print(i + "��°�� �� ��: ");
			int width=s.nextInt();
			a[i] = new int[width];
		}
		arrayIO(a);
	}
	
	static void arrayIO(int [][] a) {
		System.out.print("�� ����� ���� �Է�����.");
		// �迭�� ��� �� �Է¹ޱ�
		for (int i=0;i< a.length; i++) {
			for (int j=0;j< a[i].length; j++) {
				System.out.printf("a[%d][%d]: ", i,j);
				a[i][j] = s.nextInt();
			}
		}
		// �迭 ����� �� ����ϱ�
		for (int i=0;i< a.length; i++) {
			for (int j=0;j< a[i].length; j++) {
				System.out.printf("%3d", a[i][j]);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		System.out.print("�� ��: ");
		int height = s.nextInt();
		int [][] a = new int[height][];
		arrayCreate(a, height);
    }
}