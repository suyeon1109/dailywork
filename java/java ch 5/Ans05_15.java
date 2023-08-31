import java.util.Scanner;

public class Ans05_15 {
    public static void main(String[] args) {
        int money;
        
        Scanner s = new Scanner(System.in);
        System.out.print("가지고 있는 돈: ");
        money = s.nextInt();

        if (money>=20000) {
            System.out.println("탕수육 가능(20,000원)");
        } 

        if (money>=10000) {
            System.out.println("쟁반짜장 가능(10,000원)");
            } 
        if (money>=6000) {
            System.out.println("짬뽕 가능(6,000원)");
            } 
        if (money>=4000) {
            System.out.println("짜장면 가능(4,000원)");
            } 
        if (money <4000) {
            System.out.println("다음에 오세요");
        }

    }
}
