import java.util.Scanner;

public class Up09_3 {
	static String str,letter;
	
	static void exceptOf() {
		String result = "";
		str=str.toLowerCase();
		letter=letter.toLowerCase();
		for(int i = 0; i < str.length(); i++) {
			if (str.charAt(i)!= letter.charAt(0))
                result += str.charAt(i);
		}

		str = result;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("���ڿ� �Է�: ");
		str = s.nextLine();
		System.out.print("������ ����: ");
		letter = s.next();
		
		exceptOf();
		System.out.println(str);
    }
}