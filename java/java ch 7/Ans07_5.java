import java.util.Scanner;
public class Ans07_5 {
	public static void main(String[] args) {
		int num,end=0;
	
		while (end==0) {
			Scanner s = new Scanner(System.in);
			System.out.print("정수를 입력해주세요: ");
			num=s.nextInt();
		
			if (num%10==0) {
				System.out.printf("%d는 10으로 나누어집니다.\n",num);
			}
			else {
				System.out.printf("%d는 10으로 나누어지지 않습니다.\n",num);
			}
			
			System.out.print("한번 더? [yes ...0/no ...any]");
			end=s.nextInt();
		
		}
		
		
	}
}