public class Ans06_13 {
    public static void main(String[] args) {
        int twoss=0, threess=0;
        for (int i=1;i<=10;i++) {
            if (i%2==0) {
                System.out.printf("%d (2의 배수)\n", i);
                twoss+=i;
            }
            if (i%3==0) {
                System.out.printf("%d (3의 배수)\n", i);
                threess+=i;
            }
        }
        System.out.printf("2의 배수합: %d\n3의 배수합: %d", twoss,threess);
	}
}