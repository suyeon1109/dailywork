import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Ans10_10 {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream(args[0]); 
		FileOutputStream fos= new FileOutputStream(args[1]);
		int ch;
		
		System.out.println("ȭ�� ���");
		while ((ch=fis.read())!=-1) {// �ƽ�Ű�ڵ�� �о��
			System.out.print((char) ch);
			
			if (ch>='a' && ch<='z') {
				fos.write((byte) (ch-32));
			} else if (ch>='A' && ch<='Z') {
				fos.write((byte) (ch+32));
			} else if (ch=='\n' || ch=='\r') {
				fos.write((byte)ch);
			}else {
				fos.write((byte)'*');
			}
			// �߰��߰� ���̿� �ٹٲ� ��� �ϴ���
		}
		System.out.println("����Ϸ�");
		fis.close();
		fos.close();
	}
}