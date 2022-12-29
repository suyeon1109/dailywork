import java.util.Scanner;

public class Up09_6 {
	static Scanner s = new Scanner(System.in);
	
	static void arrayCreate (int [][] a, int height) {
		for (int i=0;i< height; i++) {
			System.out.print(i + "행째의 열 수: ");
			int width=s.nextInt();
			a[i] = new int[width];
		}
		arrayIO(a);
	}
	
	static void arrayIO(int [][] a) {
		System.out.print("각 요소의 값을 입력하자.");
		// 배열의 요소 값 입력받기
		for (int i=0;i< a.length; i++) {
			for (int j=0;j< a[i].length; j++) {
				System.out.printf("a[%d][%d]: ", i,j);
				a[i][j] = s.nextInt();
			}
		}
		// 배열 요소의 값 출력하기
		for (int i=0;i< a.length; i++) {
			for (int j=0;j< a[i].length; j++) {
				System.out.printf("%3d", a[i][j]);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		System.out.print("행 수: ");
		int height = s.nextInt();
		int [][] a = new int[height][];
		arrayCreate(a, height);
    }
}