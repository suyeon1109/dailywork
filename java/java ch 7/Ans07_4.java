import java.util.Scanner;
public class Ans07_4 {
	public static void main(String[] args) {
		int start,end,o_sum=0,e_sum=0;
		Scanner s = new Scanner(System.in);
		System.out.print("시작수: ");
		start=s.nextInt();
		System.out.print("끝수: ");
		end=s.nextInt();
		
		while (start<=end) {
			if (start%2==0) {
				e_sum+=start;
			}
			else {
				o_sum+=start;
			}
			start++;
		}
		System.out.printf("홀수의 합: %d\n 짝수의 합= %d",o_sum,e_sum);
		
	}
}