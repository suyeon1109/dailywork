import java.util.Scanner;

public class Ans08_4 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int aa[] = new int[7];
		int a;
		
		for (int i=1;i<=7;i++) {
			System.out.printf("%d��° ���ڸ� �Է��ϼ���: ", i);
			a = s.nextInt();
			aa[i-1] = a;
		}
		
		System.out.print("3�� ���: ");
		for (int i=0;i<7;i++) {
			if (aa[i]%3==0) {
				System.out.printf("%d ", aa[i]);
			}
		}
		
	}
}