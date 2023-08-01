package Sorting;

public class Cars {
    int id;
    String Model;
    String color;
    String typeOfVihicle;

    String registerNumber;
    Cars(int id,String model,String color,String typeOfVihicle,String registerNumber){
        this.id=id;
        this.Model=model;
        this.color=color;
        this.typeOfVihicle=typeOfVihicle;
        this.registerNumber=registerNumber;
    }

    public String getModel() {
        return Model;
    }
}
