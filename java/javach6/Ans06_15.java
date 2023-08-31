import java.util.Scanner;

public class Ans06_15 {
    public static void main(String[] args) {
        int freq,a,sum=0;
        Scanner s = new Scanner(System.in);
        System.out.print("몇 개의 데이터를 입력 받을 건가요? ");
        freq=s.nextInt();
        for (int i=1;i<=freq;i++) {
            System.out.printf("%d번째 데이터 입력: ",i);
            a=s.nextInt();
            sum+=a;
        }

        System.out.printf("합계값: %d 평균값: %.1f",sum,(float)sum/freq);
	}
}