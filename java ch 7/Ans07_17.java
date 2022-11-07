public class Ans07_17 {
    public static void main(String[] args) {
        int i=1;

        while (i<=40) {
            if (i%10!=5) {
                System.out.print("-");
            }
            else {
                    System.out.print("+");
                }

            i++;
        }

    }
}
