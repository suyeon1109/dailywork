public class Ans07_18 {
	public static void main(String[] args) {
		int i=2,k=1;

        while (i<=9) {
            System.out.printf("## 제%d단\n",i);
            while (k<=9) {
                System.out.printf("%d x %d = %d \n", i,k,k*i);
                k++;
            }
            k=1;
            
            System.out.print("\n");
            i++;
        }
		
	}
}