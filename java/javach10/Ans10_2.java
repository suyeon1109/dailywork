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
			System.out.print("첫번째 수를 입력하세요: ");
			int num1=s.nextInt();
			System.out.print("계산할 연산자를 입력하세요: ");
			char operator=s.next().charAt(0);
			System.out.print("두번째 수를 입력하세요: ");
			int num2=s.nextInt();
			
			if (operator=='/' && num2==0) {
				throw new Exception("0으로 나누면 안됩니다.");
			} else if (operator=='*' && (num1==0 || num2==0)) {
				throw new Exception("0으로 곱하면 어차피 0입니다.");
			} else if (operator=='-' && num1<num2) {
				throw new Exception("결과가 음수입니다.");
			}
			
			System.out.printf("결과 값: %d",operate(num1,operator,num2));
		} catch (Exception e) {
			System.out.print("error: ");
			System.out.println(e.getMessage());
		}
	}
}