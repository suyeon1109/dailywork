import java.util.Scanner;

public class Ans05_20 {
    public static void main(String[] args) {
        int score;
        
        Scanner s = new Scanner(System.in);
        System.out.print("점수를 입력하세요 (0~100점): ");
        score = s.nextInt();

        switch (score/10){
			case 9:
                System.out.println("A입니다");
				break;
			case 8:
                System.out.println("B입니다");
                break;
			case 7:
                System.out.println("C입니다");
                break;
			case 6:
                System.out.println("D입니다");
                    break;
			default:
				System.out.println("또 만나요...!!!");
		}
    }
}
