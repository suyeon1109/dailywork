public class Ans06_20 {
    public static void main(String[] args) {
        for (int i=0;i<=127;i++) {
            String k = Integer.toHexString(i); 
            if (i%16==0) {
                System.out.print("---------------------------\n10진수\t16진수\t문자\n");
            }
            else {
                System.out.printf("%d \t %s \t %c\n",i,k,i);
            }
            
        }
            
	}
}