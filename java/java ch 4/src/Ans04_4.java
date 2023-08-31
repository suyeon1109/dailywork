public class Ans04_4 {
    public static void main(String[] args) {
        int a = 10, b=5, c;

        a++;
        --b;
        System.out.printf("a=%d b=%d\n", a,b);
        c= --a*3 + b--;
        System.out.printf("a=%d b=%d c=%d\n", a,b,c);
        a=5;
        System.out.printf("a는 %d입니다\n", a++);
        System.out.printf("a는 %d입니다\n", a);
    }
    
}


// 예상 결과:
// a=11 b=4
// a=11 b=4 c=34
// a는 5입니다
// (a=6)
// a는 6입니다

// 답: 
// a=11 b=4
// /a=10 b=3 c=34
// a는 5입니다
// a는 6입니다