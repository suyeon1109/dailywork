public class Ans09_11 {
	static void sub(int a, char b) {
		if (b=='k') {
			System.out.printf("Á¦°öÀº:%3d\n", a*a);
		}
		else if (b=='e') {
			System.out.printf("square:%3d\n", a*a);
		}
	}
	public static void main(String[] args) {
		int num=10;
		
		sub(5,'k');
		sub(num,'e');
	}
}