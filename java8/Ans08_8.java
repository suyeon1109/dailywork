public class Ans08_8 {
	public static void main(String[] args){
		int [][]aa = new int[3][4];
		int i,k;
		int val=1;
		
		for (i=0;i<3;i++) {
			for (k=0;k<4;k++) {
				aa[i][k] = val;
				val+=2;
			}
		}
		
		System.out.print("aa[2][3]부터 aa[0][0]까지 출력\n");
		
		for (i=2;i>=0;i--) {
			for (k=3;k>=0;k--) {
				System.out.printf("%3d",aa[i][k]);
			}
			System.out.println();
		}
	}
}