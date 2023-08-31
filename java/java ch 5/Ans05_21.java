import java.util.Scanner;

public class Ans05_21 {
    public static void main(String[] args) {
        int year;
        
        Scanner s = new Scanner(System.in);
        System.out.print("년도를 입력하세요: ");
        year = s.nextInt();

        if (year%4==0 && year%100!=0) {
            System.out.printf("윤년이므로 %d년은 2월이 29일 입니다.", year);
        }
        else if (year%400==0) {
            System.out.printf("윤년이므로 %d년은 2월이 29일 입니다.", year);
        }
        else {
            System.out.printf("윤년이 아니므로 %d년은 2월이 28일 입니다.", year);
        }
    }
}
