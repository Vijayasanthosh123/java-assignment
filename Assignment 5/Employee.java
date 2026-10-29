class Employee {
    String n;
    double s;

    Employee(String n, double s) {
        this.n = n;
        this.s = s;
    }
}

class Developer extends Employee {
    String l;

    Developer(String n, double s, String l) {
        super(n, s);
        this.l = l;
    }

    void show() {
        System.out.println(n + " " + s + " " + l);
    }
}

class Tester extends Employee {
    String t;

    Tester(String n, double s, String t) {
        super(n, s);
        this.t = t;
    }

    void show() {
        System.out.println(n + " " + s + " " + t);
    }
}

class Main {
    public static void main(String[] args) {
        Developer d = new Developer("Ram", 30000, "Java");
        Tester t = new Tester("Sam", 25000, "Selenium");
        d.show();
        t.show();
    }
}
