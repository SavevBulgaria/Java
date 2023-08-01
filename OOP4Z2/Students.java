package OOP4Z2;

public class Students {
    //fields
    public String name;
    public String family;
    public Integer number;

    public scores thisStudentScores = new scores();

    //constructors


    public Students() {

    }

    public Students(String name, String family, int number) {
        this.name = name;
        this.family = family;
        this.number = number;
    }
    //method Print info ::

    public void Printinfo() {
        System.out.println();
        System.out.println("INFO ABOUT STUDENT : " + this.name + "  " + this.family + " " + this.number);
        System.out.println("Math score : " + thisStudentScores.math);
        System.out.println("Physics score : " + thisStudentScores.phys);
        System.out.println("Programming score : " + thisStudentScores.prog);
        System.out.println("-------------------------------------------------------------");
        System.out.println("Average Result : "+thisStudentScores.avgScore());
    }


}
