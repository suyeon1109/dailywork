import java.util.Scanner;

public class Ans07_14_2 {
	public static void main(String[] args) {
		int num,count=0, rev=0;

        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.print("양의 정수를 입력해주세요: ");
            num=s.nextInt();

            if (num>0)
                break;
        }     

        while (num>0) {
            rev=rev*10+num%10;
            num /= 10;
            count++;
        }

        System.out.printf("입력한 숫자는 %d자리입니다.",count);
    }
}