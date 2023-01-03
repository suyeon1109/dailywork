import java.util.Scanner;

public class Ans10_2 {
	static Scanner s = new Scanner(System.in);
	
	static int operate(int num1,int operator,int num2) {
		int answer;
		switch (operator) {
			case '+': answer=num1+num2;
			case '-': answer=num1-num2;
			case '*': answer=num1*num2;
			default: answer=num1/num2;
		}
		return answer;
	}
	
	public static void main(String[] args) {
		try {
			System.out.print("ù��° ���� �Է��ϼ���: ");
			int num1=s.nextInt();
			System.out.print("����� �����ڸ� �Է��ϼ���: ");
			char operator=s.next().charAt(0);
			System.out.print("�ι�° ���� �Է��ϼ���: ");
			int num2=s.nextInt();
			
			if (operator=='/' && num2==0) {
				throw new Exception("0���� ������ �ȵ˴ϴ�.");
			} else if (operator=='*' && (num1==0 || num2==0)) {
				throw new Exception("0���� ���ϸ� ������ 0�Դϴ�.");
			} else if (operator=='-' && num1<num2) {
				throw new Exception("����� �����Դϴ�.");
			}
			
			System.out.printf("��� ��: %d",operate(num1,operator,num2));
		} catch (Exception e) {
			System.out.print("error: ");
			System.out.println(e.getMessage());
		}
	}
}