import java.util.Scanner;
public class Ans07_6 {
	public static void main(String[] args) {
		int num,i=1;
		Scanner s = new Scanner(System.in);
		System.out.print("�� �� ���: ");
		num=s.nextInt();
		
		while (i<=num) {
			if (i%2==0) {
				System.out.print("-");
			}
			else {
				System.out.print("+");
			}
			i++;
		}
		
	}
}