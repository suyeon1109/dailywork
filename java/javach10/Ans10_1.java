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
		System.out.print("����(���)�� �Է��ϼ���: ");
		int num=s.nextInt();
		try {
			if (num<=0) {
				throw new Exception("������ �Է��ϼ̽��ϴ�.");
			}
			System.out.printf("1 ~ %d = %d\n",num,calcstep(num));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}