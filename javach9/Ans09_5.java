import java.util.Scanner;

public class Ans09_5 {
	public static void main(String[] args) {
		String inputid,writeid;
		Scanner s = new Scanner(System.in);
		System.out.print("아이디 입력: ");
		inputid = s.nextLine();
		
		writeid = inputid.toLowerCase();
		
		System.out.println("저장된 아이디: "+writeid);
	}
}