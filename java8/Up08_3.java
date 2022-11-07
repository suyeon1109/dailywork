import java.util.Scanner;

public class Up08_3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int len=0,com;
		char car='A';
		char []queue=new char[5];
		
		while (true) {
			System.out.print("<1> 넣기  <2> 빼기  <3> 끝: ");
			com = s.nextInt();
			
			if (com==3) {
				System.out.printf("현재 큐에 %d개 있음 ==>\n", len+1);
				System.out.println("프로그램 종료");
				break;
			}
			else if (com==1) {
				if (len==5) {
					System.out.println("큐 꽉참");
					// len=4;
					continue;
				}
				queue[len]=car;
				System.out.printf("%c 들어감\n",car++);
				len++;
			}
			else if (com==2) {
				if (len==0) {
					System.out.println("큐 비었음");
					continue;
				}
				// queue[len]=car;
				System.out.printf("%c 빠짐\n",car);
				len--;
			}
			else System.out.println("잘못 입력했습니다");
			System.out.printf("현재 큐에 %d개 있음 ==>", len);
			for (int i=0;i<len;i++) {
				System.out.printf("%3c",queue[i]);
			}
			System.out.println();
		}

	}
}