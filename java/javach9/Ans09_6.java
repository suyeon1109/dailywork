import java.util.Scanner;

public class Ans09_6 {
	public static void main(String[] args) {
		String response,ans,res;
		Scanner s = new Scanner(System.in);
		
		System.out.print("�亯: ");
		response = s.nextLine();
		
		System.out.print("����: ");
		ans = s.nextLine();
		
		res=response.toLowerCase();
		
		if (res.equals(ans)) {
			System.out.println("���� �Դϴ�.");
		}
		else {
			System.out.println("���� �Դϴ�.");
		}
		
		
	}
}