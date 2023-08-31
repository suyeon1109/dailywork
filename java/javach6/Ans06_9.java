public class Ans06_9 {
	public static void main(String[] args) {
		int i,k;
		for (i=2; i<=9; i++) {
			System.out.printf("## Á¦%d´Ü\n",i);
			for (k=1;k<9;k++) {
				System.out.printf("%d x %d = %d \n", i,k,k*i);
			}
			System.out.print("\n");
		}
	}
}