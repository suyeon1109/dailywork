import java.util.Scanner;

public class Ans06_16 {
    public static void main(String[] args) {
        int from,to,period;
        Scanner s = new Scanner(System.in);
        System.out.print("몇 cm부터: ");
        from=s.nextInt();
        System.out.print("몇 cm까지: ");
        to=s.nextInt();
        System.out.print("몇 cm마다: ");
        period=s.nextInt();

        for (int i=from;i<=to;i+=period) 
            System.out.printf("%dcm    %.1fkg\n: ",i, ((float)i-100)*0.9);
	}
}