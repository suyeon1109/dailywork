public class Ans06_11 {
	public static void main(String[] args) {
        int sum=0;

		for (int i=0; i<=100; i++) {
            if (i%10==0) {
                System.out.printf("1 ~ %d = %d\n",i,sum+i);
            }
            sum+=i;
		}
	}
}