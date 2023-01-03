import java.util.Scanner;
import java.util.Random;
 
public class Up09_10 {
	static Scanner s = new Scanner(System.in);
	
	//계속할지 여부 확인 
	static boolean retry(){
		int cont;
		do{
			System.out.print("다시 한 번? <Yes_1 / No_0>: ");
			cont = s.nextInt();
			if(cont==0 || cont==1) break;
		}while(true);
		return cont==1;
	}
		
	//문제출제, 해답비교
	static void testing(){
		Random rand = new Random();
		int x = rand.nextInt(900) + 100;
		int y = rand.nextInt(900) + 100;
		int z = rand.nextInt(900) + 100;
		int pattern = rand.nextInt(4);
					
		/*테스트
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
			//case 3 : answer = x - y - z;		//에러 컴파일러가 answer 초기화되지 않을 수 있다고 판단
			default : answer = x - y - z;
		}

		//System.out.println(answer); //테스트
		
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
				System.out.println("정답입니다!");
				break;
			}
			System.out.println("틀렸습니다!");
		}			
	}
	
    public static void main(String[] args) {
		System.out.println("암산 훈련!!");	
		do{
			testing();			
			if(!retry()) break;
		}while(true);
    }
}