public class Ans09_13 {
	static int calcstep(int a, int b, int c) {
		int sum=0;
		for (int i=a;i<=b;i+=c) {
			sum+=i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.printf("1 ~ 10 = %d\n", calcstep(1,10,2));
		System.out.printf("2 ~ 10 = %d\n", calcstep(2,10,2));
		System.out.printf("3 ~ 10 = %d\n", calcstep(3,10,3));
	}
}