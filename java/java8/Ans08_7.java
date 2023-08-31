import java.util.Scanner;

public class Ans08_7 {
	public static void main(String[] args){
		int a[] = {22,57,11,32,91,32,70}, b;
		Scanner s = new Scanner(System.in);
		
		System.out.print("찾을 숫자를 입력하세요: ");
		b = s.nextInt();
		
		for (int i=a.length-1;i>=0;i--) {
			if (a[i]==b){
				System.out.printf("그 값은 a[%d]에 있습니다.",i);
				break;
			}
			System.out.print("해당 값이 존재하지 않습니다.");
			break;
		}
	}
}