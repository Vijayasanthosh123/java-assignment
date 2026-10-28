package firstprogram;



public class ElectricityBill {

    
    double calculateBill(int units) {
        double bill = 0.0;

        if (units <= 100) {
            bill = units * 2.0;
        } else if (units <= 200) {
            bill = (100 * 2.0) + ((units - 100) * 3.0);
        } else {
            bill = (100 * 2.0) + (100 * 3.0) + ((units - 200) * 5.0);
        }

        return bill;
    }

    
    double addFixedCharge(double billAmount) {
        return billAmount + 50.0;
    }

    
    void displayBill(double energyCharge, double finalBill) {
        System.out.println("Energy Charge: " + energyCharge);
        System.out.println("Fixed Charge : 50.0");
        System.out.println("Final Bill   : " + finalBill);
    }

    public static void main(String[] args) {
        ElectricityBill eb = new ElectricityBill();

    
        int units = 250;

        double energyCharge = eb.calculateBill(units);
        double finalBill = eb.addFixedCharge(energyCharge);

        eb.displayBill(energyCharge, finalBill);
    }
}