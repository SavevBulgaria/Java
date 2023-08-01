package tryCatchTestingExpirements;

public class TryCatchExamples {
    public static void main(String[] args) {

        try{
            int a =5;
            int b =0;
            System.out.println(a/b);

        }catch (ArithmeticException e){
            System.out.println("An exception occured " + e);
        }finally {
            System.out.println("Noot Noot");
        }
    }
}
