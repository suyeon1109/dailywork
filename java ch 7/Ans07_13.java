import java.util.Scanner;

public class Ans07_13 {
	public static void main(String[] args) {
		int x;
        Scanner s = new Scanner(System.in);
        x=s.nextInt();
        
        abc:
        for (int i=1;i<3;i++) {
            System.out.print("A");
            xyz:
            for (int j=1;j<2;j++) {
                int t =i+j;
                if (t==x+1) continue abc;
                if (t==x+2) break abc;
                if (t==x+3) continue xyz;
                if (t==x+4) break xyz;
                System.out.print("B");
            }
        }
		
	}
}

// <x=6> 땡. 답: ABAB
// i=1 "A"
// j=1
// t=2
// t=x+4 => break xyz

// i=2 "A"
// j=1
// t=3
// t=x+2 => break abc




// <x=5> 땡. 답: ABAB
// i=1 "A"
// j=1
// t=2
// t=x+3 => continue xyz "B"



// <x=4> 땡. 답: ABAB
// i=1 "A"
// j=1
// t=2
// t=x+2 => break abc



// <x=3> 땡. 답: ABAB
// i=1 "A"
// j=1
// t=2
// t=x "B"



// <x=1>
// i=1 "A"
// j=1
// t=2
// t=x+1 => continue "B"


// i=2 "A"
// j=1 
// t=3
// t=x+2 => break abc



// <x=2> 땡. 답: ABA
// i=1 "A"
// j=1
// t=2
// t=x "B" 끝.