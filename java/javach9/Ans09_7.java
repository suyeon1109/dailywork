import java.util.Scanner;

public class Ans09_7 {
	public static void main(String[] args) {
		String response,res,ans;
		Scanner s = new Scanner(System.in);
		
		System.out.print("�亯: ");
		response = s.nextLine();
		res = response.replace(" ", "");
		

		System.out.print("����: ");
		ans = s.nextLine();
		
		res = res.toLowerCase();
		
		if (res.equals(ans)) {
			System.out.println("���� �Դϴ�.");
		}
		else {
			System.out.println("���� �Դϴ�.");
		}

		
	}
}