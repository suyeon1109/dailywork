import java.util.Scanner;

public class Ans07_25 {
	public static void main(String[] args) {
		int year,month,days;
        Scanner s = new Scanner(System.in);

        while (true) {
        System.out.print("연도: ");
        year=s.nextInt();
        if (year==0)
            break;

        System.out.print("달: ");
        month=s.nextInt();

        if (month==2) {
            if (year%4==0 && year%100!=0) {
                days = 29;}
            else if (year%400==0) {
                days = 29;
            }
            else {
                days = 28;
            }} 

        else if (month%2==0) {
            if (month<7)
                days = 30;
            else {
                days = 31;
            }
        }
        else {
            if (month<=7)
                days = 31;
            else {
                days = 30;
            }
        }

        System.out.printf("%d년 %d월의 날수는 %d일입니다.\n",year,month,days);
		
	}
}}