import java.util.Scanner;

public class solution {
    public String void sol(String my_string, int[][] queries) {
        String reverse = "";
        for (int i=0;i<queries.length;i++) {
            for (int j=0;j<queries[i][1]-queries[i][0]+1;j++) {
                reverse+=my_string.charAt(queries[i][1]-j);
            }
            reverse="";
        }
        // java methods cannot return string value
        // so return array and make another printing method
        return my_string;
    }

    public static void main(String[] args) {
        System.out.print("answer");
        System.out.print(sol("rermgorpsam", {{2, 3}, {0, 7}, {5, 9}, {6, 10}}));
        // fix input values of sol after making the printing method
    }
}
