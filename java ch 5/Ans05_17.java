import java.util.Scanner;

public class Ans05_17 {
    public static void main(String[] args) {
        char fam;
        
        Scanner s = new Scanner(System.in);
        System.out.print("문자를 입력하세요: ");
        fam = s.next().charAt(0);

        if (fam=='f' || fam=='F') {
            System.out.println("Father");
        }
        if (fam=='m' || fam=='M') {
            System.out.println("Mother");
        }

        if (fam=='b' || fam=='B') {
            System.out.println("Brother");
        }
        if (fam=='s' || fam=='S') {
            System.out.println("Sister");
        }
    }
}
