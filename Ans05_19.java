import java.util.Scanner;

public class Ans05_19 {
    public static void main(String[] args) {
        int dist,price;
        
        Scanner s = new Scanner(System.in);
        System.out.print("운행거리를 입력하시오(m): ");
        dist = s.nextInt();

        if (dist<=2000) {
            System.out.printf("%d(m) -> 1300원", dist);
        }
        else {
            price = 1300+(dist-2000)/200*100;
            System.out.printf("%d(m) -> %d", dist, price);
        }
    }
}
