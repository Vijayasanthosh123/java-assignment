public class count2 {
    public static void main(String[] args) {
        int[] a = {10, -5, 0, 20, -15};
        int pos = 0, neg = 0, zero = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0)
                pos++;
            else if (a[i] < 0)
                neg++;
            else
                zero++;
        }

        System.out.println("Positive: " + pos);
        System.out.println("Negative: " + neg);
        System.out.println("Zero: " + zero);
    }
}
