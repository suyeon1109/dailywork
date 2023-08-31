import java.util.Scanner;

public class Ans07_14 {
	public static void main(String[] args) {
		int x=-1, length;
        String str_x;
        Scanner s = new Scanner(System.in);

        while (x<0) {
        System.out.print("양의 정수를 입력하세요: ");
        x=s.nextInt();
        }

        str_x = " "+x;
        length = str_x.length();

        System.out.printf("입력한 숫자는 %d자리입니다.", length-1);
		
	}
}

//숫자로 다시