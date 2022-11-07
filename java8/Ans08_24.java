public class Ans08_24 {
	public static void main(String[] args) {
		int b=0;
		int []temp=new int[10];
		int a[] = {6,2,2,3,4,2,6,5,3,1};
		
		for (int i=0;i<10;i++) {
			System.out.printf("%4d", a[i]);
		}
		System.out.println();
		
		for (int i=0;i<10;i++) {
			for (int j=0;j<10;j++) {
				if (a[i]!=a[j]) {
					temp[]=a[i];
				}
			}
		}
		
		System.out.printf("최저온도: %d\n", min);
	}
}