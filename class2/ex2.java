package class2;

public class ex2 {
    int x = 60;

    public static void main(String[] args) {
        ex2 original = new ex2();
        System.out.println("Original value - "+original.x);
        ex2 myObj1 = new ex2();
        ex2 myObj2 = new ex2();
        myObj2.x = 60;
        myObj1.x = 50;
        System.out.println("Changed - " + myObj1.x);
        System.out.println("Not changed - " + myObj2.x);
    }
}
