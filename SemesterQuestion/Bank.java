package SemesterQuestion;

public class Bank implements User,Admin{
    double account;

    @Override
    public double getAccount() {
        return this.account;
    }
     public void setAccount(double account){
        this.account=account;
    }
}
