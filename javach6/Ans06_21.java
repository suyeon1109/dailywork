import java.util.Scanner;

public class Ans06_21 {
    public static void main(String[] args) {
        String str;
        Scanner s = new Scanner(System.in);
        System.out.print("글자를 입력: ");
        str=s.nextLine();


        for (int i=str.length()-1;i>=0;i--) {
            System.out.printf("%c",str.charAt(i));
        }
            
	}
}