public class BingoCaller {
    private static final String[] COLUMN_LETTERS = {"B", "I", "N", "G", "O"};
    private static boolean[] numbersCalled = new boolean[75];

    // part a
    public static boolean hasBeenCalled(int num) {
        // num represents element
        if (numbersCalled.length==75) {
            return numbersCalled[num-1];
        } else {
            return false;
        }
    }

    // part b
    public static int getRandomNumber(String letter) {
        if (letter.equals("B")) {
            return (int)Math.random()*15+1;
        } else if (letter.equals("I")) {
            return (int)Math.random()*15+16;
        } else if (letter.equals("N")) {
            return (int)Math.random()*15+31;
        } else if (letter.equals("G")) {
            return (int)Math.random()*15+46;
        } else {
            return (int)Math.random()*15+61;
        }
    }

    // part c 
    public static String makeCall() {
        String letter = COLUMN_LETTERS[(int)Math.random()*4+1];
        int num = getRandomNumber(letter);
        if (hasBeenCalled(num)==true) {
            return ("previously called.");
        } else {
            numbersCalled[num]=true;
            return (letter+num);
        }
    }
}
