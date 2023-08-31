public class Ans07_19 {
    public static void main(String[] args) {
        int num,count=0;

        for (num=1;num<=100;num++) {
            if (num%10==0) {
                System.out.printf("%d  ",num);
                count++;
            }
            else {
                continue;
            }
        }

        System.out.printf("\n10의 배수의 개수: %d\n",count);

    }
}
