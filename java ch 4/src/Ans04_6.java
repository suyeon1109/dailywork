public class Ans04_6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("변환하려는 센치미터는? ");
        cm=s.nextInt();
        
        System.out.printf("인치(실수): %f", (float)cm/2.54);
        System.out.printf("인치(정수): %d", (int)(cm/2.54));
    }
}

// 왜 에러나는지 전혀 모르겠음