public class Ans08_9 {
	public static void main(String[] args){
		int [][]aa = new int[3][4];
		int i,k,sum=0;
		int val=1;
		
		for (i=0;i<3;i++) {
			for (k=0;k<4;k++) {
				aa[i][k] = val++;
				sum+=aa[i][k];
			}
		}
		
		System.out.print("aa[0][0]���� aa[2][3]���� ���\n");
		
		for (i=0;i<=2;i++) {
			for (k=0;k<=3;k++) {
				System.out.printf("%3d\t\t%d�� �հ�: %d, ���: %d",aa[i][k]);
				System.out.printf("%d�� �հ�: %d, ���: %.2f",k,sum,(double)sum/4);
			}
			System.out.println();
		}
	}
}