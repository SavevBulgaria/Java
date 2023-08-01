package interfacePractice;

public interface Drawable {
    void draw();
}
class Circle implements Drawable{
    @Override
    public void draw(){
        System.out.println("Draws Circle LUL");
    }
}
class Square implements Drawable{
    @Override
    public void draw(){
        System.out.println("Draws a Circle");
    }
}
