import java.util.Scanner;

public class Up06_4 {
    public static void main(String[] args) {
        int h,w;
        Scanner s = new Scanner(System.in);
        System.out.print("height(행): ");
        h = s.nextInt();
        System.out.print("width(열): ");
        w = s.nextInt();

        for (int i=1;i<=h;i++) {
            for (int j=i;j<=w+i-1;j++) {
                System.out.print(j%10);
            }
            
            System.out.println();
            
        }
    }
}
