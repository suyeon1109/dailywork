import java.util.Scanner;
import java.io.IOException;

public class Ans10_3 {
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		String userName ="hanbit";
		String input="";
		int key;
		
		try { // System.in.read() �޼ҵ�� try~catch������ ����� ��
			System.out.print("�̸�: ");
			//�ƽ�Ű�ڵ� '\n' (10), enter (13) �� �ƴϸ� ���ѹݺ�
			while ((key=System.in.read())!=10) {
				// �Է��� ������ key�� ���ڿ��� �����Ͽ� input�� ������
				if (key < '0' || key > '9') 
					input+=Character.toString((char)key);
				
				
			}
			if (userName.equals(input))
				System.out.println(input+"��, �������.");
			else
				System.out.println("��ϵǾ����� �ʽ��ϴ�.");
		} catch (IOException e) {
			e.printStackTrace(); // ���� �߻� ��� & ���� �޽��� ǥ��
		}	
	}
}