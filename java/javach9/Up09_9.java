import java.util.Scanner;
import java.util.Random;

public class Up09_9 {
	static Scanner s = new Scanner(System.in);
	static int[] arrayRemove(int[] a, int idx, int n) {
		int[] c = new int[n];
		if (idx+n>a.length) {
			for (int i=0;i<a.length;i++) {
				c[i]=a[idx+i];
			}
		} else {
			int index=0;
			for (int i=0;i<a.length;i++) {
				if (i<idx || i>idx+n-1) {
					c[index]=a[i];
					index++;
				}
			}
		}
		return c;
	}
	
	static int[] arrayInsert(int[] a, int idx, int x) {
		int[] c = new int[a.length+1];
		for (int i=0;i<c.length;i++) {
			if (i<idx) {
				c[i]=a[i];
			} else if (i==idx) {
				c[i]=x;
			} else {
				c[i]=a[i-1];
			}
		}
		return c;
	}
	
	
	public static void main(String[] args) {
		int[] x = {1,3,5,7,9,11};
		System.out.print("삭제를 시작할 인덱스: ");
		int idx=s.nextInt();
		System.out.print("삭제할 요소의 개수: ");
		int n=s.nextInt();
		int[] y = arrayRemove(x,idx,n);
		for (int i=0;i<y.length;i++) {
			System.out.printf("y[%d]: %d\n",i,y[i]);
		}
		
		System.out.print("삽입할 인덱스: ");
		idx=s.nextInt();
		System.out.print("삽입할 값: ");
		n=s.nextInt();
		int[] z = arrayInsert(x,idx,n);
		for (int i=0;i<z.length;i++) {
			System.out.printf("z[%d]: %d\n",i,z[i]);
		}
	}
		
}