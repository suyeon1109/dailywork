import java.util.Scanner;

public class Ans10_1 {
	static Scanner s = new Scanner(System.in);
	
	static int calcstep(int end) {
		int sum=0;
		for (int i=1;i<=end;i++) {
			sum+=i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.print("끝수(양수)를 입력하세요: ");
		int num=s.nextInt();
		try {
			if (num<=0) {
				throw new Exception("음수를 입력하셨습니다.");
			}
			System.out.printf("1 ~ %d = %d\n",num,calcstep(num));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}