import java.util.Scanner;

public class Up09_11 {
	static Scanner s = new Scanner(System.in);
	static boolean retry() {
		int cont;
		do{
			System.out.print("�ٽ� �� ��? <Yes_1 / No_0>: ");
			cont = s.nextInt();
			if(cont==0 || cont==1) break;
		}while(true);
		return cont==1;
	}

	static void testing() {
		int answer,correct=0,wrong=0;
		
		System.out.print("������: ");
		int questions = s.nextInt();
		
		for (int i=1;i<=questions;i++) {
			System.out.printf("[���� %d]",i);
			
			Random rand = new Random();
			int x = rand.nextInt(900) + 100;
			int y = rand.nextInt(900) + 100;
			int z = rand.nextInt(900) + 100;
			int pattern = rand.nextInt(4);

			switch(pattern){
				case 0 : answer = x + y + z; break;
				case 1 : answer = x + y - z; break;
				case 2 : answer = x - y + z; break;
				//case 3 : answer = x - y - z;
				default : answer = x - y - z;
			}

			System.out.println(answer); //�׽�Ʈ
			
			System.out.print(x + ((pattern<2)? " + ":" - ") + y + ((pattern%2==0)? " + ":" - ")+ z + " = ");
			int k = s.nextInt();
			if(k == answer){
				correct++;
			} else wrong++;
		}
		
		System.out.printf("����: %d\n",correct);
		System.out.printf("����: %d\n",wrong);
		
	}

	public static void main(String[] args) {
		System.out.println("�ϻ� �Ʒ�");
		do {
			testing();
			if ( !retry() ) break;
		} while (true);
		System.out.println("���� ��");
	}
}