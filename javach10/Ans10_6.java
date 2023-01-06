import java.io.IOException;
import java.util.Scanner;
import java.io.PrintWriter;

public class Ans10_6 {
	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		PrintWriter pw = new PrintWriter("data4.txt");
		String str;
		
		while (!(str=s.nextLine()).equals("")) 
			pw.println(str);
		pw.close();
		s.close();
	}
}