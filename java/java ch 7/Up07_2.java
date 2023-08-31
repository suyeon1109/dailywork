import java.util.Scanner;

public class Up07_2 {
	public static void main(String[] args) {
		int start,end,mul,sum=0;

        Scanner s = new Scanner(System.in);
        System.out.print("합계의 시작값: ");
        start=s.nextInt();
        System.out.print("합계의 끝값: ");
        end=s.nextInt();
        System.out.print("배수: ");
        mul=s.nextInt();

        int a=start;

        while (a<=end) {
            if (a%mul==0)
                sum+=a;
            a++;
        }

        System.out.printf("%d부터 %d까지의 %d배수의 합계: %d", start,end,mul,sum);
            
    }
}