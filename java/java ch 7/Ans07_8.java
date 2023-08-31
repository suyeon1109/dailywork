import java.util.Scanner;
public class Ans07_8 {
	public static void main(String[] args) {
		int num;
		Scanner s = new Scanner(System.in);
		System.out.print("정수를 입력해주세요: ");
		num=s.nextInt();
		
		do {
			System.out.printf("%d  ",num);
			num-=2;
			
		}while (num>=0);
		
	}
}