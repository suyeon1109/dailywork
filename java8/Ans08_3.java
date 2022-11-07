import java.util.Scanner;

public class Ans08_3 {
	public static void main(String[] args){
		int aa[] = {10,20,30,40,50};
		int count,size,sum=0;
		
		count = aa.length;
		size = count*Integer.BYTES;
		
		for (int i=0;i<count;i++) {
			sum+=aa[i];
		}
		
		System.out.printf("배열 aa[]의 요소의 개수는 %d개 입니다.\n", count);
		System.out.printf("배열 aa[]의 요소의 전체크기는 %d바이트 입니다.\n", size);
		System.out.printf("합계 ==> %d\n", sum);
		
	}
}