import java.util.Scanner;

public class Up07_6 {
	public static void main(String[] args) {
		int a=100,min,max=0, count;

        Scanner s = new Scanner(System.in);
        System.out.print("몇개의 데이터를 입력 받을 건가요?  ");
        count=s.nextInt();
        System.out.printf("%d개의 데이터를 입력하세요\n", count);

        System.out.print("1번째 데이터 입력: ");
        min=s.nextInt();

        for (int i=2;i<=count;i++) {
            System.out.printf("%d번째 데이터 입력: ", i);
            a=s.nextInt();
            
            if (a>max)
                max=a;
            else if (a<min)
                min=a;
        }
        System.out.printf("\n최대값: %d  최소값: %d\n", max,min);
    }
}