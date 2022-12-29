import java.util.Scanner;

public class Up09_7 {
	// a,b의 최솟값을 반환하는 메소드 정의
	static int mymin(int x, int y) {
		int min = x;
		if (y<min) {
			min = y;
		}
		return min;
	}
	
	// a,b,c의 최솟값을 반환하는 메소드 정의
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
	
	// 배열 a의 최솟값을 반환하는 메소드 정의
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
		System.out.print("x값: ");
		int x = s.nextInt();
		System.out.print("y값: ");
		int y = s.nextInt();
		System.out.print("z값: ");
		int z = s.nextInt();
		
		System.out.print("배열 a의 요소 수: ");
		int num = s.nextInt();
		int[] a = new int[num];
		for (int i=0;i<a.length;i++) {
			System.out.print("a["+i+"]: ");
			a[i]=s.nextInt();
		}
		
		System.out.printf("x,y의 최솟값은 %d입니다.\n", mymin(x,y));
		System.out.printf("x,y,z의 최솟값은 %d입니다.\n", mymin(x,y,z));
		System.out.printf("배열 a의 최솟값은 %d입니다.\n", mymin(a));
	}
		
}