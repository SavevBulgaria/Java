package OOP4Z2;

public class scores {
    public double math;
    public double phys;
    public double prog;

    //construcotrs
    //def :
    public scores() {
        this.math = 0;
        this.phys = 0;
        this.prog = 0;


    }

    //param :
    public scores(double math, double phys, double prog) {
        this.math = math;
        this.phys = phys;
        this.prog = prog;

    }

    public double avgScore() {
        double avgResult = (this.math + this.phys + this.prog) / 3;
        return avgResult;
    }


}
