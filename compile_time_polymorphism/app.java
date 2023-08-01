package compile_time_polymorphism;

import java.util.Scanner;
//OverLoading
public class app {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 2 integers");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println("Enter 2 doubles");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        System.out.println("Calling method for int ...");
        System.out.println(sum(a,b));
        System.out.println("Calling method for double ...");
        System.out.println(sum(x,y));

    }
    public static int sum (int a,int b){
        return a+b;
    }
    public static double sum(double x,double y){
        return x+y;
    }
}
