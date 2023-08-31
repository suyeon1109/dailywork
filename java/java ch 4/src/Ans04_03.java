public class Ans04_03 {
    public static void main(String[] args) {
        int a =3, b=4;
        a++;
        --b;
        System.out.printf("a=%d b=%d\n", a,b);
        a=b++;
        System.out.printf("a=%d b=%d\n", a,b);
        a=++b;
        System.out.printf("a=%d b=%d\n", a,b);
    }
}


// 예상 결과:
// a=3 b=3
// a=3 b=4
// a=4 b=5

// 답:
// a=4 b=3
// a=3 b=4
// a=5 b=5