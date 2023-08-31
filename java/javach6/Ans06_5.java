import java.util.Scanner;

public class Ans06_5 {
	public static void main(String[] args) {
		int start,end,e_sum=0,o_sum=0;
		Scanner s = new Scanner(System.in);
		System.out.print("시작수: ");
		start = s.nextInt();
		System.out.print("끝수: ");
		end = s.nextInt();
		
		for (int i=start; i<=end; i++) {
			if (i%2==0) {
				e_sum+=i;
			}
			else {
				o_sum+=i;
			}
		}
		System.out.printf("홀수의 합 = %d \n", o_sum);
		System.out.printf("짝수의 합 = %d \n", e_sum);
		//System.out.println("end");
	}
}