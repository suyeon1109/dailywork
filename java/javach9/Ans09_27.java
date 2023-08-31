public class Ans09_27 {
	static int[][]arrayClone(int[][] a) {
		int[][] clone = new int[a.length][];
		for (int i=0;i<a.length;i++) {
			clone[i]= new int[a[i].length];
		}
		
		for (int i=0;i<a.length;i++) {
			for (int j=0;j<a[i].length;j++) 
				clone[i][j]=a[i][j];
		}
		return clone;
		
	}
		
	public static void main(String[] args) {
		int[][] a = {{1,2,3},{4,5},{7,8,9,10}},z;
		z=arrayClone(a);
		for (int i=0;i<z.length;i++) {
			for (int j=0;j<z[i].length;j++) 
				System.out.printf("%3d",z[i][j]);
			System.out.println();
		}
	}
}