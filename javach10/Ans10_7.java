import java.io.IOException;
import java.util.*;
import java.io.PrintStream;
import java.io.FileNotFoundException;

public class Ans10_7 {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("D:\¿À»óÈÆ>java Ans10_07");
		Scanner scan1 = new Scanner(fis);
		FileOutputStream fos= new FileOutputStream("c:/Windows/win.ini mywin.txt");
		PrintStream ps = new PrintStream(fos);
		String str;
		List<String> files = new ArrayList<String>();
		
		while (!(str=s.nextLine()).equals("")) 
			files.add(str);
		
		for (int i=0;i<files.length;i++) {
				System.out.println(files[i]);
				ps.println(files[i]);
		}
		fis.close();
		fos.close();
		ps.close();
		s.close();
	}
}