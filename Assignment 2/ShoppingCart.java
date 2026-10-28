package firstprogram;

public class ShoppingCart {


    double calculateTotal(double p1, double p2, double p3) {
        return p1 + p2 + p3;
    }

    
    double calculateDiscount(double total, String membership) {
        double discount = 0.0;

        if (membership.equalsIgnoreCase("Gold")) {
            discount = total * 0.20; // 20%
        } else if (membership.equalsIgnoreCase("Silver")) {
            discount = total * 0.10; // 10%
        } else if (membership.equalsIgnoreCase("Regular")) {
            discount = total * 0.05; // 5%
        }

        return discount;
    }

    
    double calculateFinalAmount(double total, double discount) {
        return total - discount;
    }


    void displayBill(double total, double discount, double finalAmount) {
        System.out.println("Total Amount: " + total);
        System.out.println("Discount: " + discount);
        System.out.println("Final Amount: " + finalAmount);
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

    
        double item1 = 2000.0;
        double item2 = 1500.0;
        double item3 = 500.0;
        String membership = "Gold";

        double total = cart.calculateTotal(item1, item2, item3);
        double discount = cart.calculateDiscount(total, membership);
        double finalAmount = cart.calculateFinalAmount(total, discount);

        cart.displayBill(total, discount, finalAmount);
    }
}