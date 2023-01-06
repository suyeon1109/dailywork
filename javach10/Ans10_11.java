import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Ans10_11 {
	public static void main(String[] args) throws Exception {
		String str;
		char ch;
		int[] count=new int[10];
		System.out.println("파일명 입력: ");
		String filename = s.nextLine();
		FileInputStream fis = new FileInputStream(filename); 
		System.out.println("숫자 문자('0'~'9') 출현 횟수");
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
			System.out.println("파일을 찾을 수 없음");
		} finally {
			System.out.println("프로그램 종료: ");
			fis.close();
			/*try {
				// 스트림 종료
				fis.close();
			} catch (Exception e) {
				// 에러발생 경로와 에러메시지 표시
				System.out.println(e.getMessage());
				fis.close();
			}*/
		}

		
	}
}

/*
System.out.println("화면 출력");
		while ((ch=fis.read())!=-1) {// 아스키코드로 읽어옴
			System.out.print((char) ch);
			fos.write((byte) ch);
		}
		System.out.println("복사완료");
/**/