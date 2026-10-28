class Student1{
    String name;
    int age;

    Student(String name){
        this.name = name;
        this.age = 0;
    }

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Student1 s1 = new Student1("Prabanjan");
        Student1 s2 = new Student1("Arun", 21);

        s1.display();
        s2.display();
    }
}
