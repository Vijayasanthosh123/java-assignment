class Employee1{
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void displayDetails(){
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }

    void responsibilities(){
        System.out.println("General employee responsibilities");
    }
}

class Developer extends Employee1{
    Developer(String name, int id){
        super(name, id);
    }
    void responsibilities(){
        System.out.println("Develops and tests software applications");
    }
}

class Manager extends Employee1{
    Manager(String name, int id){
        super(name, id);
    }
    void responsibilities(){
        System.out.println("Manages teams and plans projects");
    }
}

public class Main{
    public static void main(String[] args) {
        Developer d = new Developer("Arun", 101);
        Manager m = new Manager("Priya", 102);

        d.displayDetails();
        d.responsibilities();

        m.displayDetails();
        m.responsibilities();
    }
}
