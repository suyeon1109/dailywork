import java.util.Scanner;

public class Up07_4 {
	public static void main(String[] args) {
		int count=0, upper=0, lower=0, num=0;
        String str;

        Scanner s = new Scanner(System.in);
        System.out.print("문자열 입력: ");
        str=s.nextLine();

        do{
            if (str.charAt(count) >= 'A' && str.charAt(count) <= 'Z'){
                upper++;}
            if (str.charAt(count) >= 'a' && str.charAt(count) <= 'z'){
                lower++;}
            if (str.charAt(count) >= 48 && str.charAt(count) <= 57){
                num++;}
            
            count++;

        }while (count<str.length());

        System.out.printf("대문자 %d개, 소문자 %d개, 숫자 %d개", upper,lower,num);
    }
}