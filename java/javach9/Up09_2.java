import java.util.Scanner;

public class Up09_2 {
	static String exceptOf(String str, String letter) {
		String[] strAry= str.split(letter);
		String result="";
		for (int i=0;i<strAry.length;i++) {
			result+=strAry[i];
		}
		return result;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("���ڿ� �Է�: ");
		String str = s.nextLine();
		System.out.print("������ ����: ");
		String letter = s.next();
		
		str = exceptOf(str,letter);
		System.out.println(str);
    }
}