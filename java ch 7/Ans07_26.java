import java.util.Scanner;

public class Ans07_26 {
	public static void main(String[] args) {
		int num1,num2;
        char ch,end;
        Scanner s = new Scanner(System.in);

        while (true) {
            while (true) {
                System.out.print("더하기(A),빼기(S),곱하기(M),나누기(D) 연산선택: ");
                ch=s.next().charAt(0);
                if (ch=='A'|| ch=='a' ||ch=='S' ||ch=='s' ||ch=='M' ||ch=='m' ||ch=='D' ||ch=='d') break;

                System.out.printf("A,S,M,D중 하나만 입력하세요");
            }
            

            System.out.print("첫번째 숫자: ");
            num1=s.nextInt();

            System.out.print("두번째 숫자: ");
            num2=s.nextInt();
            

            if (ch=='A'||ch=='a')
                System.out.printf("정답: %d\n", num1+num2);
            else if (ch=='S'||ch=='s')
                System.out.printf("정답: %d\n", num1-num2);
            else if (ch=='M'||ch=='m')
                System.out.printf("정답: %d\n", num1*num2);
            else if (ch=='D'||ch=='d'){
                while (true) {
                    if (num2!=0) {
                        System.out.printf("정답: %.1f\n", (float)num1/num2);
                        break;
                    }
                    System.out.print("0으로 나누지 못함\n");
                    System.out.print("두번째 숫자: ");
                    num2=s.nextInt();
                }
            }

            System.out.print("계속(아무키나), 종료(Q/q): ");
            end=s.next().charAt(0);
            if (end=='Q' || end=='q') {
                break;
            }
    }
        
}}