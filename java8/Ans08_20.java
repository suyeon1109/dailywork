public class Ans08_20 {
	public static void main(String[] args) {
		int ary[] = {5,7,3,4,1,6};
		System.out.println("[출력문자]");
		
		for (int i=0;i<6;i++) {
			System.out.printf("[%d개]: ",ary[i]);
			for (int j=1;j<=ary[i];j++) {
				System.out.print("$");
			}
			System.out.println();
		}
	}
}