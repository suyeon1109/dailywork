public class Ans04_1 {
    public static void main(String[] args) {
        int b = 5, c=3;
        System.out.printf("%d + %d = %d \n", b,c,b+c);
        System.out.printf("%d - %d = %d \n", b,c,b-c);
        System.out.printf("%d * %d = %d \n", b,c,b*c);
        System.out.printf("%d / %d = %f \n", b,c,(float)b/c);
        System.out.printf("%d % %d = %d \n", b,c,b%c);
        
    }
}


// 문제 답은 잘 찍히는데 이게 뜸
// Exception in thread "main" java.util.IllegalFormatFlagsException: Flags = ' '
// at java.base/java.util.Formatter$FormatSpecifier.checkText(Formatter.java:3191)
// at java.base/java.util.Formatter$FormatSpecifier.<init>(Formatter.java:2878)
// at java.base/java.util.Formatter.parse(Formatter.java:2713)
// at java.base/java.util.Formatter.format(Formatter.java:2655)
// at java.base/java.io.PrintStream.format(PrintStream.java:1209)
// at java.base/java.io.PrintStream.printf(PrintStream.java:1105)
// at Ans04_1.main(Ans04_1.java:8)