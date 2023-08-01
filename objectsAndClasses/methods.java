package objectsAndClasses;

public class methods {
    public static double avrg(double x, double []y) {
        double sum =0;
        for(int i =0;i<y.length;i++){
            sum += y[i];
        }

        return sum/x;

    }

    public static double sum(double [] y) {
        double sum =0;
        for(int i =0;i<y.length;i++){
            sum += y[i];
        }
        return sum;
    }

    public static double evenOdd(double x, double [] y) {

        return y.length%x;
    }
}