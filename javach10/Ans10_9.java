import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.File;

public class Ans10_9 {
	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(new File("in.txt"));
		PrintWriter pw = new PrintWriter("out.txt");
		String str,reverse;
		while (s.hasNextLine()) {
			reverse="";
			str=s.nextLine();
			for (int i=str.length()-1;i>=0;i--) {
				reverse = reverse + str.charAt(i);
			}
			System.out.println(reverse);
		}
		
		s.close();
		pw.close();
	}
}