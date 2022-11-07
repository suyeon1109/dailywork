import java.util.Scanner;

public class Ans08_18 {
	public static void main(String[] args) {
		int ary[] = new int[5];
		int sum=0,count=0;
		double average;
		Scanner s = new Scanner(System.in);
		
		for (int i=1;i<6;i++) {
			System.out.printf("º∫¿˚%d: ",i);
			ary[i-1] = s.nextInt();
			sum+=ary[i-1];
		}
		
		average=(double)sum/5;
		
		for (int i=1;i<6;i++) {
			if (ary[i-1]>=average) {
				count++;
			}
		}
		
		System.out.printf("∆Ú±’: %.1f\n",average);
		System.out.printf("∆Ú±’¿ÃªÛ: %d∏Ì",count);
	}
}