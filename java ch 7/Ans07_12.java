import java.util.Scanner;

public class Ans07_12 {
	public static void main(String[] args) {
		int num,sum=0, end=1;
	
		while (end==1) {
			Scanner s = new Scanner(System.in);
			System.out.print("정수 입력하시오(0:종료): ");
			num=s.nextInt();

            if (num==0) {
                end=0;
            }

            else {
            sum+=num;
            System.out.printf("지금까지 합: %d\n",sum);
            }
		
		}
		
		
	}
}