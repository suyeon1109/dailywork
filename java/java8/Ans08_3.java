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
		
		System.out.printf("�迭 aa[]�� ����� ������ %d�� �Դϴ�.\n", count);
		System.out.printf("�迭 aa[]�� ����� ��üũ��� %d����Ʈ �Դϴ�.\n", size);
		System.out.printf("�հ� ==> %d\n", sum);
		
	}
}