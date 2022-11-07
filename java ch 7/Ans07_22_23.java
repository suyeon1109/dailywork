import java.util.Scanner;

public class Ans07_22_23 {
	public static void main(String[] args) {
        char ch;
        Scanner s = new Scanner(System.in);
        

        
        while (true) {
            System.out.print("문자입력(@:종료) : ");
            ch=s.next().charAt(0);

            if (ch=='@') {
                break;
            }


            else if (ch>='a' && ch<='z') {
                System.out.printf("%c의 대문자는 %c\n",ch, ch-32);
            }

            else if (ch>='A' && ch<='Z') {
                System.out.printf("%c의 소문자는 %c\n",ch, ch+32);
            }

            else {
                System.out.print("잘못 입력하였습니다.\n");
            }
            

        }

		
	}
}