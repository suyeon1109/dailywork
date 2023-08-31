import java.util.Scanner;

public class Up09_1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("문자열 입력: ");
		String str = s.nextLine();
		boolean check=true;
		
		for (int i=0; i<str.length(); i++) {
			if (str.charAt(i)!=str.charAt(str.length()-i-1)){
				check=false;
				break;
			}
		}
		
		if (check) System.out.println("회문");
		else System.out.println("회문아님");	
    }
}