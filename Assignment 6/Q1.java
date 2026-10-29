class Q1 {
    public static void main(String[] args) {
        int p = 1234, b = 5000, w = 2000, x = 1234;

        if (x != p)
            System.out.println("Wrong PIN");
        else if (w > b)
            System.out.println("Insufficient Balance");
        else
            System.out.println("Balance: " + (b - w));
    }
}
