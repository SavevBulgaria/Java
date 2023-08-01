package tryCatchTestingExpirements;

public class Test1 {
    public static void main(String[] args) {

        try{
            String zero = null;
            int a=5;
            int b=0;
            int z= zero.length();
        if(5/2==1){
            throw new ArithmeticException("Division by 0 is not allowed");
        }

        }catch (ArithmeticException e){
            System.out.println(e);
        }catch (NullPointerException e){
            System.out.println(e);
        }finally {
            System.out.println("Thanks for running the code");
        }

    }
}
