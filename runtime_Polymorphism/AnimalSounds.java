package runtime_Polymorphism;

public class AnimalSounds {
    public void makeASound(){
        System.out.println("Hello world default");
    }
}
class Dog extends AnimalSounds{
    @Override
    public void makeASound(){
        System.out.println("Woof Woof");
    }
}

class Cat extends  AnimalSounds{
    @Override
    public void makeASound(){
        System.out.println("Meow Meow~");
    }
}

