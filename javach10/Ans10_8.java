import java.io.IOException;
import java.io.PrintWriter;

public class Ans10_8 {
	public static void main(String[] args) throws Exception {
		PrintWriter pw = new PrintWriter("gugu.txt");
		for (int i=1;i<=9;i++) {
			for (int j=2;j<=9;j++) {
				pw.print(String.format("%2dX%2d=%2d",j,i,j*i));
				if (j==9) {
					pw.println();
				} else {
					pw.print(" ");
				}
			}
		}
		pw.close();
	}
}