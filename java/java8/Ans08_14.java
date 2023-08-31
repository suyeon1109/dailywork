public class Ans08_14 {
	public static void main(String[] args) {
		int park[] = {2,4,6,8,10};
		int i=2;
		
		System.out.printf("%5d", park[i++]);
		System.out.printf("%5d", park[++i]);
		System.out.printf("%5d", park[i]--);
		System.out.printf("%5d\n", --park[i]);
		
		// 6 --> 10 --> 10 --> 8
	}
}