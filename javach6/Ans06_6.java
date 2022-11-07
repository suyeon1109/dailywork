import java.util.Scanner;

public class Ans06_6 {
	public static void main(String[] args) {
		int start,end,inc,sum=0;
		Scanner s = new Scanner(System.in);
		System.out.print("시작값 입력: ");
		start = s.nextInt();
		System.out.print("끝값 입력: ");
		end = s.nextInt();
		System.out.print("증가값 입력: ");
		inc = s.nextInt();
		
		for (int i=start; i<=end; i+=inc) {
			sum+=i;
		}
		System.out.printf("%d에서 %d까지 %d씩 증가한 값의 합: %d",start,end,inc,sum);
	}
}