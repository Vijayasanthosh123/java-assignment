class Q3 {
    public static void main(String[] args) {
        int m = 85;

        if (m < 0 || m > 100)
            System.out.println("Invalid Marks");
        else if (m >= 90)
            System.out.println("Grade A");
        else if (m >= 75)
            System.out.println("Grade B");
        else if (m >= 50)
            System.out.println("Grade C");
        else
            System.out.println("Fail");
    }
}
