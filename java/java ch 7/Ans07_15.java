import java.util.Scanner;

public class Ans07_15 {
	public static void main(String[] args) {
		int x, i=9;
        Scanner s = new Scanner(System.in);
        System.out.print("원하는 단 입력: ");
        x=s.nextInt();

        while (i>=1) {
            System.out.printf("%d x %d = %d \n", x,i,x*i);
            i--;
        }
		
	}
}