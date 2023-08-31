public class Ans04_08 {
    public static void main(String[] args) {
        int a,b,c,d;

        a=b=c=3;
        a++;
        ++b;
        d=c++;
        System.out.printf("a=%d b=%d c=%d d=%d\n", a,b,c,d);
    }
}


// 예상 결과:
// a=4 b=4 c=4 d=4

// ans: a=4 b=4 c=4 d=3