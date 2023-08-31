public class Ans09_21 {
	public static void main(String[] args) {
		String s1 = "ABC";
		String s2 = "ABC";
		String s3 = new String("ABC");
		String s4 = new String("ABC");
		String s5 = null;
		String s6 = "";
		String s7 = new String("");
		
		System.out.println(s1=="ABC");
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s3==s4);
		System.out.println(s5==s6);
		System.out.println(s5==s7);
		System.out.println(s6==s7);
		
		System.out.println("s5 = "+s5);
		System.out.println("s6 = "+s6);
		System.out.println("s7 = "+s7);
		System.out.println("s6의 길이 = "+s6.length());
		System.out.println("s7의 길이 = "+s7.length());
		System.out.println("s5 길이 = "+s5.length());
	}
}