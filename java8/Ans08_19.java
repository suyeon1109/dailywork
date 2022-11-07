import java.util.Scanner;

public class Ans08_19 {
	public static void main(String[] args) {
		int ary[] = new int[5];
		Scanner s = new Scanner(System.in);
		
		for (int i=0;i<ary.length;i++) {
			System.out.printf("己利%d: ",i+1);
			ary[i] = s.nextInt();
		}
		
		System.out.print("荐沥茄 己利:");
		for (int i=0;i<ary.length;i++) {
			ary[1]=0;
			if (i!=1) {
				if (ary[i]>=90) {
					ary[i]=100;
				}
				else {
					ary[i]+=10;
				}
			}
			System.out.printf("%5d",ary[i]);
		}
		
	}
}