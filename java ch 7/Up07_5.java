import java.util.Scanner;

public class Up07_5 {
	public static void main(String[] args) {
		int a=100,min=99,max=10, count;

        Scanner s = new Scanner(System.in);
        System.out.print("몇개의 데이터를 입력 받을 건가요?  ");
        count=s.nextInt();
        System.out.printf("%d개의 데이터를 입력하세요\n", count);

        for (int i=1;i<=count;i++) {
            while (true) {
                System.out.printf("%d번째 데이터 입력: ", i);
                a=s.nextInt();

                if (a<100 && a>=10) {
                    if (a>max)
                        max=a;
                    else if (a<min)
                        min=a;
                    break;
                }

                System.out.printf("\n***2자리 정수를 입력하세요***", i);
            }

            System.out.println();
        }
        System.out.printf("\n최대값: %d  최소값: %d\n", max,min);
    }
}