import java.util.Scanner;

public class Ans09_22 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String s1,s2,str;
		System.out.print("문자열 s1: ");
		s1=s.nextLine();
		System.out.print("문자열 s2: ");
		s2=s.nextLine();
		
		int idx = s1.indexOf(s2);
		
		if (idx==-1) System.out.println("s1안에 s2가 포함되어 있지 않습니다.");
		else {
			System.out.println(s1);
			for (int i=0;i<idx;i++) System.out.print(' ');
			System.out.println(s2);
		}
		
		
		/*
		if (s1.length()>=s2.length()) {
			size=s1.length();
			str=s1;
		}
		else {
			size=s2.length();
			str=s2;
		}
		
		String[] equals = new String [size];
		
		for (int i=0;i<s1.length();i++) {
			for (int j=0;j<s2.length();j++) {
				if ((s1.charAt[i]).equals(s2.charAt[j])) {
					equals[i]=s1.charAt[i];
				}
				else {
					equals[i]=' ';
				}
			}
		}
		
		System.out.println(str);
		for (int i=0;i<size;i++) {
			System.out.print(equals[i]);
		} */
	}
}