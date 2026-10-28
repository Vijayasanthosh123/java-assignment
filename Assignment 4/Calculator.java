class Calculator{
    int add(int a, int b){
        return a + b;
    }

    double add(double a, double b){
        return a + b;
    }
}

class Employee{
    double calculateBonus(){
        return 1000;
    }
}

class Developer extends Employee{
    double calculateBonus(){
        return 5000;
    }
}

class Manager extends Employee{
    double calculateBonus(){
        return 10000;
    }
}

public class Main {
    public static void main(String[] args){
        Calculator c = new Calculator();

        System.out.println(c.add(10, 20));
        System.out.println(c.add(10.5, 20.5));

        Employee e1 = new Developer();
        Employee e2 = new Manager();

        System.out.println(e1.calculateBonus());
        System.out.println(e2.calculateBonus());
    }
}
