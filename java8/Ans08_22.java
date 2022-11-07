import java.util.Random;

public class Ans08_22 {
	public static void main(String[] args) {
		int a=1;
		int[][] data = new int[4][5];
		
		for (int i=0;i<=2;i++) {
			int row_sum=0;
			for (int j=0;j<=3;j++) {
				data[i][j] =a;
				row_sum+=a;
				System.out.printf("%4d",a);
				a++;
			}
			System.out.printf("%4d",row_sum);
			data[i][4]=row_sum;
			
			System.out.println();
		}
		
		for (int i=0;i<=4;i++) {
			int col_sum=0;
			for (int j=0;j<=2;j++) {
				col_sum+=data[j][i];
			}
			System.out.printf("%4d",col_sum);
		}
	}
}