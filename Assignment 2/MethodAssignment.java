package firstprogram;

public class MethodAssignment {
    String employeeName = "John";
    double grossSalary;
    double netSalary;

    
    double calculateSalary(double basicSalary, double allowance) {
        grossSalary = basicSalary + allowance;
        return grossSalary;
    }

    
    double calculateNetSalary(double grossSalary, double deductions) {
        netSalary = grossSalary - deductions;
        return netSalary;
    }

    
    void displayDetails() {
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Gross Salary: " + grossSalary);
        System.out.println("Net Salary: " + netSalary);
    }

    public static void main(String[] args) {
        MethodAssignment emp = new MethodAssignment();

        emp.calculateSalary(25000, 5000);
        emp.calculateNetSalary(emp.grossSalary, 2000);
        emp.displayDetails();
    }
}

