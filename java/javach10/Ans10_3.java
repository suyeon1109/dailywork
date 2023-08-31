import java.util.Scanner;
import java.io.IOException;

public class Ans10_3 {
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		String userName ="hanbit";
		String input="";
		int key;
		
		try { // System.in.read() 메소드는 try~catch문으로 묶어야 함
			System.out.print("이름: ");
			//아스키코드 '\n' (10), enter (13) 이 아니면 무한반복
			while ((key=System.in.read())!=10) {
				// 입력한 정수형 key를 문자열로 변경하여 input에 덧붙임
				if (key < '0' || key > '9') 
					input+=Character.toString((char)key);
				
				
			}
			if (userName.equals(input))
				System.out.println(input+"님, 어서오세요.");
			else
				System.out.println("등록되어있지 않습니다.");
		} catch (IOException e) {
			e.printStackTrace(); // 에러 발생 경로 & 에러 메시지 표시
		}	
	}
}