public class BingoCaller {
    private static final String[] COLUMN_LETTERS = {"B", "I", "N", "G", "O"};
    private static boolean[] numbersCalled = new boolean[75];

    // part a
    public static boolean hasBeenCalled(int num) {
        if (numbersCalled.length==75) {
            return numbersCalled[num+1];
        } else {
            return false;
        }
    }

    // part b
    public static int getRandomNumber(String letter) {
        if (letter=="B") {
            return (int)Math.random()*15+1;
        } else if (letter=="I") {
            return (int)Math.random()*15+16;
        } else if (letter=="N") {
            return (int)Math.random()*15+31;
        } else if (letter=="G") {
            return (int)Math.random()*15+46;
        } else {
            return (int)Math.random()*15+61;
        }
    }

    // part c 
    public static String makeCall() {
        int letterIndex = (int)Math.random()*4;
        String letter = 
        int num = getRandomNumber(letter);

    }
}
