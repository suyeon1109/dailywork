public class Up06_5 {
    public static void main(String[] args) {
        System.out.print("  | ");
        for (int j=1; j<=9; j++) {
            System.out.printf(" %d  ",j);
            if (j==9) {
                System.out.println();
            }
        }
        for (int i=1;i<=40;i++) {
            if (i==3)
                System.out.print("+");
            else {
                System.out.print("-");
            }
            
        }
        System.out.println(); //System.out.print("--+-------------------------------------\n");

        for (int i=1; i<=9; i++) {
            System.out.printf("%d |",i);
            for (int k=1;k<=9;k++) {
                if (k*i<10)
                System.out.printf("  %d ", k*i);
                else {
                System.out.printf(" %d ", k*i);
                }
                if (k==9) {
                    System.out.println();
                }
            }
    }
}}
