import java.util.Scanner;

public class Ans09_8 {
	public static void main(String[] args) {
		String idnumber,idnum;
		Scanner s = new Scanner(System.in);
		
		System.out.print("주민번호: ");
		idnumber = s.nextLine();
		idnum = idnumber.replace("-", "");
		
		String year = idnum.substring(0,2);
		char gender = idnum.charAt(6);
		
		
		
		if (gender=='1') {
			System.out.printf("19%s년생 남자", year);
		}
		
		else if (gender=='2') {
			System.out.printf("19%s년생 여자", year);
		}
		else if (gender=='3') {
			System.out.printf("20%s년생 남자", year);
		}
		else if (gender=='4') {
			System.out.printf("20%s년생 여자", year);
		}
		else {
			System.out.printf("성별을 잘못 입력하셨습니다");
		}

		
	}
}