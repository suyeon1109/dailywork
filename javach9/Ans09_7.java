import java.util.Scanner;

public class Ans09_7 {
	public static void main(String[] args) {
		String response,res,ans;
		Scanner s = new Scanner(System.in);
		
		System.out.print("답변: ");
		response = s.nextLine();
		res = response.replace(" ", "");
		

		System.out.print("정답: ");
		ans = s.nextLine();
		
		res = res.toLowerCase();
		
		if (res.equals(ans)) {
			System.out.println("정답 입니다.");
		}
		else {
			System.out.println("오답 입니다.");
		}

		
	}
}