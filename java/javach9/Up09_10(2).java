import java.util.Scanner;
import java.util.Random;
 
public class Up09_10 {
	static Scanner s = new Scanner(System.in);
	
	//������� ���� Ȯ�� 
	static boolean retry(){
		int cont;
		do{
			System.out.print("�ٽ� �� ��? <Yes_1 / No_0>: ");
			cont = s.nextInt();
			if(cont==0 || cont==1) break;
		}while(true);
		return cont==1;
	}
		
	//��������, �ش��
	static void testing(){
		Random rand = new Random();
		int x = rand.nextInt(900) + 100;
		int y = rand.nextInt(900) + 100;
		int z = rand.nextInt(900) + 100;
		int pattern = rand.nextInt(4);
					
		/*�׽�Ʈ
		pattern = 0;
		System.out.println(pattern);
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		/**/
	
		int answer;
		switch(pattern){
			case 0 : answer = x + y + z; break;
			case 1 : answer = x + y - z; break;
			case 2 : answer = x - y + z; break;
			//case 3 : answer = x - y - z;		//���� �����Ϸ��� answer �ʱ�ȭ���� ���� �� �ִٰ� �Ǵ�
			default : answer = x - y - z;
		}

		//System.out.println(answer); //�׽�Ʈ
		
		while(true){
			String question = "" + x;
			if (pattern<2) question += " + " + y ;
			else question += " - " + y ;
			
			if (pattern%2==0) question += " + " + z +  " = ";
			else question += " - " + z +  " = " ;
			System.out.print(question);
			
			//System.out.print(x + ((pattern<2)? " + ":" - ") + y + ((pattern%2==0)? " + ":" - ")+ z + " = ");
			
			int k = s.nextInt();
			if(k == answer){
				System.out.println("�����Դϴ�!");
				break;
			}
			System.out.println("Ʋ�Ƚ��ϴ�!");
		}			
	}
	
    public static void main(String[] args) {
		System.out.println("�ϻ� �Ʒ�!!");	
		do{
			testing();			
			if(!retry()) break;
		}while(true);
    }
}