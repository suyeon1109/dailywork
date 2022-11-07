import java.util.Random;
import java.util.Scanner;

public class Ans08_21 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random rand = new Random();
		
		int len;
		
		System.out.print("배열 요소 수: ");
		len = s.nextInt();
		
		int ary[] = new int[len];
		
		for (int i=0;i<len;i++) {
			ary[i] = 1+ rand.nextInt(10);
			System.out.printf("%3d",ary[i]);
		}
		
		System.out.println();
		
		for (int i=10;i>=1;i--) {
			for (int j=0;j<len;j++) {
				if (ary[j]>=i) {
					System.out.print("  *");
				}
				else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
		
		for (int i=0;i<len;i++) {
			System.out.print("---");
		}
		System.out.println();
		
		for (int i=0;i<ary.length;i++) {
			System.out.printf("%3d",i%10);
		}
	}
}