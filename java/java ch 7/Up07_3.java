import java.util.Scanner;

public class Up07_3 {
	public static void main(String[] args) {
		int sw=0,money,price=50000;

        Scanner s = new Scanner(System.in);
        System.out.print("금액을 입력하시오: ");
        money=s.nextInt();

        while (money>=0) {
            System.out.printf("%9d 원 :    %d장(개)\n",price,money/price);
            money-=(money/price)*price;
            

            if (sw==0){
                price/=5;
                sw=1;
            }
            else {
                price/=2;
                sw=0;
            }
        }
    }
}