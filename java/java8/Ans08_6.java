public class Ans08_6 {
	public static void main(String[] args){
		int a[] = {10,20,30,40,50}, b[] = new int[5];
		
		for (int i=0;i<a.length;i++) {
			b[a.length-i-1] = a[i];
		}
		
		for (int i=0;i<a.length;i++) {
			System.out.printf("a[%d]=%d / b[%d]=%d\n", i,a[i],i,b[i]);
		}
	}
}