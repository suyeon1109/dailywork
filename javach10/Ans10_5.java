import java.io.IOException;
import java.util.Scanner;
import java.io.File;

public class Ans10_5 {
	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(new File("data2-1.txt"));
		float sum=0;
		while (s.hasNextLine()) 
			sum += s.nextFloat();
		System.out.println("гу╟Х: "+sum);
		s.close();
	}
}