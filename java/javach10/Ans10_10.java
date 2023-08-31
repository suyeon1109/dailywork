import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Ans10_10 {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream(args[0]); 
		FileOutputStream fos= new FileOutputStream(args[1]);
		int ch;
		
		System.out.println("화면 출력");
		while ((ch=fis.read())!=-1) {// 아스키코드로 읽어옴
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
			// 중간중간 사이에 줄바꿈 어떻게 하는지
		}
		System.out.println("복사완료");
		fis.close();
		fos.close();
	}
}