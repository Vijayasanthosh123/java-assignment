class Person {
    String n;
    int a;

    Person(String n, int a) {
        this.n = n;
        this.a = a;
    }
}

class Student extends Person {
    int r;

    Student(String n, int a, int r) {
        super(n, a);
        this.r = r;
    }

    void show() {
        System.out.println(n + " " + a + " " + r);
    }
}

class Main {
    public static void main(String[] args) {
        Student s = new Student("Ram", 20, 101);
        s.show();
    }
}
