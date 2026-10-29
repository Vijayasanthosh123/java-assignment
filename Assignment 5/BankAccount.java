class BankAccount {
    String n;
    double b;

    BankAccount(String n, double b) {
        this.n = n;
        this.b = b;
    }

    void show() {
        System.out.println(n + " " + b);
    }
}

class SavingsAccount extends BankAccount {
    double r;

    SavingsAccount(String n, double b, double r) {
        super(n, b);
        this.r = r;
    }

    void showS() {
        show();
        System.out.println(r);
    }
}

class PremiumSavingsAccount extends SavingsAccount {
    double p;

    PremiumSavingsAccount(String n, double b, double r, double p) {
        super(n, b, r);
        this.p = p;
    }

    void showP() {
        showS();
        System.out.println(p);
    }
}

class Main {
    public static void main(String[] args) {
        PremiumSavingsAccount a =
            new PremiumSavingsAccount("Ram", 50000, 5, 1000);
        a.showP();
    }
}
