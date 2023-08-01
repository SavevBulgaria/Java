package OOP20_3;

class Bank {
    float getInterestRate() {
        return 0.0f;
    }
}

class SBI extends Bank {
    float getInterestRate() {
        return 7.0f;
    }
}

class ICICI extends Bank {
    float getInterestRate() {
        return 8.0f;
    }
}

class AXIS extends Bank {
    float getInterestRate() {
        return 9.0f;
    }
}

public class Main13 {
    public static void main(String[] args) {
        Bank bank1 = new SBI();
        System.out.println("SBI Interest Rate: " + bank1.getInterestRate());

        Bank bank2 = new ICICI();
        System.out.println("ICICI Interest Rate: " + bank2.getInterestRate());

        Bank bank3 = new AXIS();
        System.out.println("AXIS Interest Rate: " + bank3.getInterestRate());
    }
}
