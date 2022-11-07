import java.util.Scanner;

public class Ans06_17 {
    public static void main(String[] args) {
        int num;
        Scanner s = new Scanner(System.in);
        System.out.print("몇 개 출력: ");
        num=s.nextInt();


        for (int i=1;i<=num;i++) {
            if (i%2!=0) {
                System.out.print("+");
            }
           else {
                System.out.print("-");
            }
            
        }
            
	}
}