import java.util.Scanner;
import java.util.Random;


public class Up08_4 {
	public static void main(String[] args) {
		Random random = new Random();
		Scanner s = new Scanner(System.in);
		int count=1, ball=0,strike=0,input=0;
		int ans=random.nextInt();
		// int []com=new int[3];
		
		while (true) {
			while (true) {
				System.out.printf("%d회 도전입니다...\n3자리 숫자를 입력하세요(첫자리 0제외): ",count);
				input=s.nextInt();
				if (input>=100 && input<=999) {
					break;
				}
				System.out.println("숫자를 잘못 입력하였습니다.");
			}
			/*for (int k=100;k>=1000;k/=10) {
				for (int j=10;j<=1000;j*=10) {
					if (input/k==ans/j) {
						if (k!=j) ball++;
						else strike++;
					}
				}
			
			
			input/100        100의 자리
			(input/10)%10    10의 자리
			(input%100)/10
			input%10         1의 자리
			}*/
			
			System.out.printf("입력하신 %d은(는) %d스트라익 %d볼입니다.\n", input,strike,ball); 
			count++;
		}
		
		

	}
}