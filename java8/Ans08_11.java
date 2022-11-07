import java.util.Scanner;

public class Ans08_11 {
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
				for(j=0; j<i; j++)
					if(a[j] == a[i]) break;
			}while(j < i); 
		}
		
		s.close();
	}
}