import java.util.Scanner;

public class Ans08_10 {
	public static void main(String[] args) {
		int len,num=0;
		
		Scanner s = new Scanner(System.in);
		System.out.print("배열 요소 수: ");
		len = s.nextInt();
		int []a = new int[len];
		
		System.out.print("a[0]: ");
		a[0] = s.nextInt();
		for (int i=1; i<n; i++) {
			do{
				System.out.printf("a[%d]: ", i);
				a[i] = s.nextInt();
			}while(a[i]==a[i-1]);
			
		}
		s.close();
	}
}