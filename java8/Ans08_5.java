import java.util.Scanner;

public class Ans08_5 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int aa[] = new int[5];
		int a,sum=0;
		
		for (int i=0;i<aa.length;i++) {
			System.out.printf("����%d: ", i+1);
			a = s.nextInt();
			aa[i] = a;
			sum+=a;
		}
		
		System.out.print("�Է°���: ");
		for (int i=0;i<aa.length;i++) {
			System.out.printf("\t%d", aa[i]);
		}
		
		System.out.printf("\n����: %d\n", sum);
		System.out.printf("���: %.1f", (double)sum/aa.length);
	}
}