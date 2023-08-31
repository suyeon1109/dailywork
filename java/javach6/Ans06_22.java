public class Ans06_22 {
    public static void main(String[] args) {
        for (int i=9;i>=1;i--) {
            for (int k=9;k>=2;k--) {
                if (k*i>=10) {
                System.out.printf("%dx %d=%d  ",k,i,k*i);
                }
                else {
                    System.out.printf("%dx %d= %d  ",k,i,k*i);
                }

                if (k==2){
                System.out.println("");
                }

            }
        }
            
	}
}