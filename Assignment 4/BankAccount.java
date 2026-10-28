class BankAccount{
    private String ah;
    private double b;

    BankAccount(String ah, double b){
        this.ah = ah;
        this.b = b;
    }

    public String getAccountHolder(){
        return ah;
    }

    public double getBalance(){
        return b;
    }

    public void setAccountHolder(String ah){
        this.ah = ah;
    }

    public void deposit(double a){
        if (a > 0){
            b += a;
        }
    }

    public void withdraw(double am){
        if (am > 0 && am <= b){
            b -= am;
            System.out.println("Withdrawal successful");
        } else{
            System.out.println("Insufficient balance or invalid amount");
        }
    }

    public static void main(String[] args){
        BankAccount a = new BankAccount("Prabanjan", 5000);

        System.out.println("Account Holder: " + a.getAccountHolder());
        System.out.println("Balance: " + a.getBalance());

        a.withdraw(2000);

        System.out.println("Remaining Balance: " + a.getBalance());
    }
}
