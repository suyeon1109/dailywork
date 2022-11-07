import java.util.Scanner;
public class Ans07_10 {
	public static void main(String[] args) {
		int a,b,i;
		Scanner s = new Scanner(System.in);
		System.out.print("정수A: ");
		a=s.nextInt();
		System.out.print("정수B: ");
		b=s.nextInt();
		
		if (a>b) {
				int t=a;
				a=b;
				b=t;
			}
		
		
		do {	
			System.out.printf("%d  ",a);
			a++;
			
		}while (a<=b);
		
	}
}