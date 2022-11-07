import java.util.Scanner;

public class Up06_6 {
    public static void main(String[] args) {
        int n, w;
        Scanner s = new Scanner(System.in);
        System.out.print("몇 개(n)를 출력합니까?: ");
        n=s.nextInt();
        System.out.print("몇 개 단위(w)로 출력합니까?: ");
        w=s.nextInt();

        for (int i=1;i<=n;i++) {
            System.out.printf("+");
            if (i%w==0 && i!=n) {
                System.out.println();
            }
            if (i% (w*3)==0 && i!=n) {
                System.out.println();
            }
        }
        System.out.println();
        System.out.println("end");
            
	}
}