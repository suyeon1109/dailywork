public class Ans08_15 {
	public static void main(String[] args) {
		int park[] = {1,3,5,7,9};
		int i=4;
		
		System.out.printf("%5d", park[--i]);
		System.out.printf("%5d", park[i--]);
		System.out.printf("%5d", ++park[i]);
		System.out.printf("%5d\n", park[i]++);
		
		// 7 --> 7 --> 6 --> 5 (x) (6임) (앞에서 값을 바꿔서)
	}
}