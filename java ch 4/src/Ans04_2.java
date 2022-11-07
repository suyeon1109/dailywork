public class Ans04_2 {
    public static void main(String[] args) {
        int a = 10;
        float b=10.000000f;

        a++;
        System.out.printf(" a ++ ==> %d \n", a);
        a--;
        System.out.printf(" a -- ==> %d \n", a);

        b+=5;
        System.out.printf(" b +=5 ==> %f \n", b);
        b-=5;
        System.out.printf(" b -=5 ==> %f \n", b);
        b*=5;
        System.out.printf(" b *= ==> %f \n", b);
        b/=5;
        System.out.printf(" b /= ==> %f \n", b);
        a%=5;
        System.out.printf(" a %= ==> %d \n",a); //여기에서 자꾸 에러
    }
}


// Exception in thread "main" java.util.UnknownFormatConversionException: Conversion = '='
//         at java.base/java.util.Formatter.checkText(Formatter.java:2732)
//         at java.base/java.util.Formatter.parse(Formatter.java:2708)
//         at java.base/java.util.Formatter.format(Formatter.java:2655)
//         at java.base/java.io.PrintStream.format(PrintStream.java:1209)
//         at java.base/java.io.PrintStream.printf(PrintStream.java:1105)
//         at Ans04_2.main(Ans04_2.java:20)