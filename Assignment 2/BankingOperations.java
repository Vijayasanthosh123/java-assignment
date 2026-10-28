package firstprogram;




public class BankingOperations {

    
    double deposit(double currentBalance, double depositAmount) {
        return currentBalance + depositAmount;
    }

    
    double withdraw(double currentBalance, double withdrawAmount) {
        if (withdrawAmount <= currentBalance) {
            return currentBalance - withdrawAmount;
        } else {
            System.out.println("Insufficient funds! Withdrawal failed.");
            return currentBalance;
        }
    }

    
    void checkBalance(double currentBalance) {
        System.out.println("Current Balance: " + currentBalance);
    }

    
    void displayTransactionSummary(double depositAmount, double withdrawAmount, double finalBalance) {
        System.out.println("\n--- Transaction Summary ---");
        System.out.println("Deposit Amount    : " + depositAmount);
        System.out.println("Withdrawal Amount : " + withdrawAmount);
        System.out.println("Final Balance     : " + finalBalance);
    }

    
    public static void main(String[] args) {
        BankingOperations bank = new BankingOperations();

        double balance = 10000.0;
        double depositAmount = 5000.0;
        double withdrawAmount = 3000.0;

        
        bank.checkBalance(balance);

        
        balance = bank.deposit(balance, depositAmount);

        
        balance = bank.withdraw(balance, withdrawAmount);

        
        bank.displayTransactionSummary(depositAmount, withdrawAmount, balance);
    }
}