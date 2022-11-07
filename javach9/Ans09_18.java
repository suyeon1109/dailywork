import java.util.Scanner;

public class Ans09_18 {
	static void printStringArray(String[] ary) {
		for (int i=0;i<ary.length;i++) {
			System.out.println(ary[i]);
		}
	}
		
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("문자열의 개수: ");
		int n = s.nextInt();
		String a;
		String[] sx = new String[n];
		
		for (int i=0;i<n;i++) {
			System.out.printf("sx[%d]= ",i);
			a = s.next();
			sx[i] = a;
		}
		
		printStringArray(sx);
		s.close();
		
	}
}