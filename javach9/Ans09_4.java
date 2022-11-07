import java.util.Scanner;

public class Ans09_4 {
	public static void main(String[] args) {
		String str,strAry[];
		Scanner s = new Scanner(System.in);
		System.out.print("수식을 한 줄로 띄어쓰기로 입력하세요: ");
		str = s.nextLine();
		strAry = str.split(" ");
		
		a = Integer.parseInt(strAry[0]);
		ch = strAry[1].charAt(0);
		b= Integer.parseInt(strAry[2]);
		
		switch (ch) {
			case '-':
				System.out.printf("%s - %s = %d",a,b,a-b);
				break;
			case '+':
				System.out.printf("%s + %s = %d",a,b,a+b);
				break;
			case '*':
				System.out.printf("%s * %s = %d",a,b,a*b);
				break;
			case '/':
				System.out.printf("%s / %s = %.2f",a,b,(float)a/b);
				break;
		}
		
		
	}
}