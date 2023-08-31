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
		System.out.print("사람 수는: ");
		int num=s.nextInt();
		
		int[] height = new int[num];
		int[] weight = new int[num];
		
		System.out.printf("%d명의 신장과 체중을 입력하자.\n", num);
		
		for (int i=0;i<num;i++) {
			System.out.printf("%d번의 신장: ",i+1);
			height[i] = s.nextInt();
			
			System.out.printf("%d번의 체중: ",i+1);
			weight[i] = s.nextInt();
		}
		
		System.out.println("가장 키가 작은 사람의 신장: "+minOf(height)+"cm");
		System.out.println("가장 마른 사람의 체중: "+minOf(weight)+"kg");
	}
}