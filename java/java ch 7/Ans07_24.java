import java.util.Scanner;

public class Ans07_24 {
	public static void main(String[] args) {
		int num,kr,eng,math,max;
        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.print("번호: ");
            num=s.nextInt();

            if (num==0){
                break;
            }

        System.out.print("국어: ");
        kr=s.nextInt();
        max =kr;

        System.out.print("영어: ");
        eng=s.nextInt();
        if (max<eng) {
            max = eng;
        }

        System.out.print("수학: ");
        math=s.nextInt();
        if (max<math) {
            max = math;
        }

        System.out.printf("최대점수: %d\n",max);

        }

		
	}
}