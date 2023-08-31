import java.util.Scanner;

public class Ans06_23 {
    public static void main(String[] args) {
        int width, length;
        Scanner s = new Scanner(System.in);
        System.out.print("가로: ");
        width=s.nextInt();
        System.out.print("세로: ");
        length=s.nextInt();

        for (int i=1;i<=length*width;i++) {
            System.out.printf("*");
            if (i%width==0) {
                System.out.println("");
            }
        }
            
	}
}