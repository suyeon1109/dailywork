import java.util.Scanner;

public class Up09_7 {
	// a,b�� �ּڰ��� ��ȯ�ϴ� �޼ҵ� ����
	static int mymin(int x, int y) {
		int min = x;
		if (y<min) {
			min = y;
		}
		return min;
	}
	
	// a,b,c�� �ּڰ��� ��ȯ�ϴ� �޼ҵ� ����
	static int mymin(int x, int y, int z) {
		int min = x;
		if (y<min) {
			min = y;
		}
		
		if (z<min) {
			min=z;
		}
		return min;
	}
	
	// �迭 a�� �ּڰ��� ��ȯ�ϴ� �޼ҵ� ����
	static int mymin(int[] a) {
		int  min=a[0];
		for (int i=1;i<a.length;i++) {
			if (min>a[i]) {
				min=a[i];
			}
		}
		return min;
	}
	
	
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("x��: ");
		int x = s.nextInt();
		System.out.print("y��: ");
		int y = s.nextInt();
		System.out.print("z��: ");
		int z = s.nextInt();
		
		System.out.print("�迭 a�� ��� ��: ");
		int num = s.nextInt();
		int[] a = new int[num];
		for (int i=0;i<a.length;i++) {
			System.out.print("a["+i+"]: ");
			a[i]=s.nextInt();
		}
		
		System.out.printf("x,y�� �ּڰ��� %d�Դϴ�.\n", mymin(x,y));
		System.out.printf("x,y,z�� �ּڰ��� %d�Դϴ�.\n", mymin(x,y,z));
		System.out.printf("�迭 a�� �ּڰ��� %d�Դϴ�.\n", mymin(a));
	}
		
}