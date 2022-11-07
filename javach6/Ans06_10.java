import java.util.Scanner;

public class Ans06_10 {
	public static void main(String[] args) {
		int freq,num;
        Scanner s = new Scanner(System.in);
        System.out.printf("몇 번 하시겠습니까? ");
        freq = s.nextInt();

		for (int i=0; i<=freq; i++) {
            System.out.printf(" 몇 단? ");
            num = s.nextInt();

            for (int k=1;k<=9;k++) {
                System.out.printf(" %d x %d = %d \n", num,k,k*num);
            }
		}
	}
}