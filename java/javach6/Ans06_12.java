public class Ans06_12 {
	public static void main(String[] args) {
        int sum=0;

		for (int i=0; i<=100; i++) {
            if (i%10==0 && i!=0) {
                System.out.printf("%d ~ %d = %d\n",i-9,i,sum+10);
                sum=0;
            }
            sum+=i;
		}
	}
}