import java.util.Scanner;

public class Ans09_26 {
	static Scanner s = new Scanner(System.in);
	
	static int[] arrayCatOf(int[] a, int[] b) {
		int[] anb = new int [a.length+b.length];
		for (int i=0;i<a.length;i++) {
			anb[i]=a[i];
		}
		
		for (int i=0;i<b.length;i++) {
			anb[i+a.length]=b[i];
		}
		return anb;
	}
		
	public static void main(String[] args) {
		int[] a = {1,2,3}, b={2,4,6,8},z;
		z=arrayCatOf(a,b);
		for (int i=0;i<z.length;i++)
			System.out.printf("%3d",z[i]);
		System.out.println();
	}
}