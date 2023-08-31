import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class Ans10_4 {
	public static void main(String[] args) throws Exception {
		FileReader fReader = new FileReader("c:/Windows/win.ini");
		BufferedReader bReader = new BufferedReader(fReader);
		String str=null;
		
		int count=1;
		while ((str=bReader.readLine())!=null) {
			System.out.printf("[%dวเ] %s\n",count,str);
			count++;
		}
		bReader.close();
		fReader.close();
	}
}