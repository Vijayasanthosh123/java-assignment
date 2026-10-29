class Q2 {
    public static void main(String[] args) {
        int u = 250;
        int b;

        if (u <= 100)
            b = u * 2;
        else if (u <= 200)
            b = 200 + (u - 100) * 3;
        else
            b = 500 + (u - 200) * 5;

        System.out.println("Bill: Rs." + b);
    }
}
