package TEMA_17;

public class Animal {
    private String name;
    private int age;

    Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String talk(){
        return "Animal Sound";
    }

    @Override
    public String toString() {
        return "NAME: " + name + "\nAGE:" + age;
    }
}


class Dog extends Animal {

    Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public String talk(){
        return "Woof Woof";
    }
}

class Cat extends Animal {
    Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public String talk(){
        return "Meow...";
    }
}
