import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Ans10_11 {
	public static void main(String[] args) throws Exception {
		String str;
		char ch;
		int[] count=new int[10];
		System.out.println("���ϸ� �Է�: ");
		String filename = s.nextLine();
		FileInputStream fis = new FileInputStream(filename); 
		System.out.println("���� ����('0'~'9') ���� Ƚ��");
		try {

			while () {
				
			}
			for (int j=0;j) {
				if (s.next().charAt(0)=='1') {
					
				}
			}
				
			for (int i=0;i<10;i++) {
				System.out.printf("%d: %2d\n"i,count[i]);
			}
		} catch (FileNotFoundException e) {
			System.out.println("������ ã�� �� ����");
		} finally {
			System.out.println("���α׷� ����: ");
			fis.close();
			/*try {
				// ��Ʈ�� ����
				fis.close();
			} catch (Exception e) {
				// �����߻� ��ο� �����޽��� ǥ��
				System.out.println(e.getMessage());
				fis.close();
			}*/
		}

		
	}
}

/*
System.out.println("ȭ�� ���");
		while ((ch=fis.read())!=-1) {// �ƽ�Ű�ڵ�� �о��
			System.out.print((char) ch);
			fos.write((byte) ch);
		}
		System.out.println("����Ϸ�");
/**/