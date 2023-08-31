import java.util.Scanner;

public class Ans05_4 {
	public static void main(String[] args) {
		float a_milk,b_milk, ap,bp;
		int a_price,b_price;
		Scanner s = new Scanner(System.in);
		System.out.print("A사 용량(리터): ");
		a_milk = s.nextFloat();
		
		System.out.print("A사 가격: ");
		a_price = s.nextInt();
		
		System.out.print("B사 용량(리터): ");
		b_milk = s.nextFloat();
		
		System.out.print("B사 가격: ");
		b_price = s.nextInt();
		
		ap = (float)a_price/a_milk;
		bp = (float)b_price/b_milk;
		
		if (ap>bp) {
			System.out.println("B사 우유가 저렴");
		}
		else {
			System.out.println("A사 우유가 저렴");
		}
	}
}