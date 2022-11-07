import java.util.Scanner;

public class Ans08_23 {
	public static void main(String[] args) {
		int days,temp,sum=0,max=0,min=0;
		Scanner s = new Scanner(System.in);
		
		System.out.print("계산하려는 날수를 입력하세요: ");
		days = s.nextInt();
		
		int[] data = new int[days];
		
		for (int i=0;i<days;i++) {
			System.out.printf("%d일 온도 입력: ",i+1);
			temp = s.nextInt();
			
			if (i==0) {
				max = data[i];
				min = data[i];
			}
			
			data[i]=temp;
			sum+=temp;
			
			if (temp>max) {
				max=temp;
			}
			else if (temp<min) {
				min=temp;
			}
		}
		
		System.out.println();
		System.out.println();
		System.out.printf("평균온도: %d\n", sum/days);
		System.out.printf("최고온도: %d\n", max);
		System.out.printf("최저온도: %d\n", min);
	}
}