public class Ans03_07 {
    public static void main(String[] args) {
        char a= 'A', b='a';
        int tol;

        tol=b-a;

        System.out.printf("%c %c \n", 'D','D'+tol);
        System.out.printf("%c %c \n", 'e','e'-tol);
    }
}
