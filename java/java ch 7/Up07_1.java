import java.util.Scanner;
import java.util.Random;


public class Up07_1 {
	public static void main(String[] args) {
		int num,ans,chance=1;

        Random random = new Random();
        num=random.nextInt(100)+1;

        Scanner s = new Scanner(System.in);

        while (chance<=10) {
            System.out.printf("%d번째 기회: ",chance);
            ans=s.nextInt();
        
            if (ans==num){
                System.out.print("정답\n");
                chance=10;
            }

            else {
                if (chance==10)
                    System.out.printf("끝...!!  정답: %d",num);

                if (ans>num)
                    System.out.printf("커요\n");
                else if (ans<num)
                    System.out.printf("작아요\n");
            }
            
            
        chance++;
        }
    }
}