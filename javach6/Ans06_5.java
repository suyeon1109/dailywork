import java.util.Scanner;

public class Ans06_5 {
	public static void main(String[] args) {
		int start,end,e_sum=0,o_sum=0;
		Scanner s = new Scanner(System.in);
		System.out.print("���ۼ�: ");
		start = s.nextInt();
		System.out.print("����: ");
		end = s.nextInt();
		
		for (int i=start; i<=end; i++) {
			if (i%2==0) {
				e_sum+=i;
			}
			else {
				o_sum+=i;
			}
		}
		System.out.printf("Ȧ���� �� = %d \n", o_sum);
		System.out.printf("¦���� �� = %d \n", e_sum);
		//System.out.println("end");
	}
}