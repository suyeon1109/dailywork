import java.util.Scanner;
public class Ans07_3 {
	public static void main(String[] args) {
		int start,end,num,sum=0;
		Scanner s = new Scanner(System.in);
		System.out.print("시작값 입력 ");
		start=s.nextInt();
		System.out.print("끝값 입력");
		end=s.nextInt();
		System.out.print("증가값 입력");
		num=s.nextInt();
		
		while (start<=end) {
			sum+=start;
			//System.out.printf("%d  ", num);
			start+=num;
		}
		System.out.printf("%d에서 %d까지 %d씩 증가한 값의 합: %d",start, end, num, sum);
		
	}
}