import java.util.Scanner;
public class Ans07_9 {
	public static void main(String[] args) {
		int num,q;
		Scanner s = new Scanner(System.in);

		
		do {
			System.out.print("정수를 입력해주세요: ");
			num=s.nextInt();			
			if (num<0) {
				System.out.printf("%d=>음수\n",num);
			}
			
			else {
				System.out.printf("%d=>양수\n",num);
			}
			
			System.out.print("다시 한번(1-Yes/any-no): ");
			q=s.nextInt();
			
		}while (q==1);
		
	}
}