class Employee {
    int employeeId;
    String employeeName;
    double salary;

    Employee(int id, String name, double sal) {
        employeeId = id;
        employeeName = name;
        salary = sal;
    }

    double calculateAnnualSalary() {
        return salary * 12;
    }

    void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Annual Salary: " + calculateAnnualSalary());
        System.out.println();
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Arun", 25000);
        Employee e2 = new Employee(102, "Divya", 35000);
        Employee e3 = new Employee(103, "Kumar", 40000);

        e1.displayDetails();
        e2.displayDetails();
        e3.displayDetails();
    }
}
