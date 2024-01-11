class PrintFormula {
    double slope;
    double y_intercept;
    PrintFormula(double slope, double y_intercept) {
        this.slope = slope;
        this.y_intercept = y_intercept;
    }
    // public String to_String(double slope, double y_intercept) {
    public String toString() {
        return("y = "+slope+"x + "+y_intercept);
    }
}

class PrintResult extends PrintFormula {
    double x_test,y_test;
    PrintResult(double slope, double y_intercept, double x_test, double y_test) {
        super(slope, y_intercept); 
        this.x_test = x_test;
        this.y_test = y_test;
    }
    @Override 
    // public String to_String(double slope, double y_intercept) {
    public String toString() {
        return("y value at x=" + x_test + " is " +(slope*x_test+y_intercept));
    }
    // public boolean Equals(double x_test, double y_test) {
    public boolean Equals() {
        if (slope*x_test+y_intercept==y_test) {
            return true;
        } else {
            return false;
        }
    }
}

public class finalproject {
    public static void displayData(double slope, double y_intercept){
        System.out.println("slope: "+slope);
        System.out.println("y_intercept: "+y_intercept);
    }
    public static void main(String[] args){
        double[] inputs = {1.0, 2.0, 3.0, 4.0, 5.0};
        double[] outputs = {2.0, 4.0, 6.0, 8.0, 10.0};
        double[] test = {3.0,6.0};

        double x_mean, y_mean, slope, y_intercept;
        
        double x_sum=0.00, y_sum=0.00;
        for (int i=0;i<inputs.length;i++) {
            x_sum+=inputs[i];
            y_sum+=outputs[i];
        }
        x_mean = x_sum/inputs.length;
        y_mean = y_sum/outputs.length;

        // System.out.println(x_mean);
        // System.out.println(y_mean);

        double numerator=0.00, denominator=0.00;
        for (int i=0;i<inputs.length;i++) {
            numerator+=(inputs[i]-x_mean)*(outputs[i]-y_mean);
            denominator+=Math.pow((inputs[i] - x_mean), 2);
        }
        slope = numerator/denominator;
        y_intercept = y_mean-slope*x_mean;

        PrintFormula formula = new PrintFormula(slope,y_intercept);
        PrintResult result = new PrintResult(slope, y_intercept, test[0], test[1]);

        System.out.println(formula.toString());
        System.out.println(result.toString());
        System.out.println(result.Equals());
        displayData(slope,y_intercept);
    }
}
