import java.util.Scanner;

public class Ans09_25 {
	static Scanner s = new Scanner(System.in);
	
	static int minOf(int[] hw) {
		int min=hw[0];
		for (int i=1;i<hw.length;i++) {
			if (min>hw[i]) min=hw[i];
		}
		return min;
	}
		
	public static void main(String[] args) {
		System.out.print("��� ����: ");
		int num=s.nextInt();
		
		int[] height = new int[num];
		int[] weight = new int[num];
		
		System.out.printf("%d���� ����� ü���� �Է�����.\n", num);
		
		for (int i=0;i<num;i++) {
			System.out.printf("%d���� ����: ",i+1);
			height[i] = s.nextInt();
			
			System.out.printf("%d���� ü��: ",i+1);
			weight[i] = s.nextInt();
		}
		
		System.out.println("���� Ű�� ���� ����� ����: "+minOf(height)+"cm");
		System.out.println("���� ���� ����� ü��: "+minOf(weight)+"kg");
	}
}