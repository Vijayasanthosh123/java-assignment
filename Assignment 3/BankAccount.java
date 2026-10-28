class BankAccount {
    int accountNumber;
    String holderName;
    double balance;

    BankAccount() {
        accountNumber = 1001;
        holderName = "Priya";
        balance = 5000.0;
    }

    void displayAccount() {
        System.out.println("Account Number: " + accountNumber);//1001
        System.out.println("Holder Name: " + holderName);//Priya
        System.out.println("Balance: " + balance);//5000.0
    }

    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        BankAccount b2 = new BankAccount();

        b1.displayAccount();//same o/p
        b2.displayAccount();//same o/p
    }
  //the same initial values, but each object has its own instance variables.
}
