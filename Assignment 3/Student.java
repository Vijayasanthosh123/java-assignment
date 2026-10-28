class Student {
    int studentId; 
    String studentName;
    String course;

    void displayDetails() {
        System.out.println(studentId); //0
        System.out.println(studentName); //null
        System.out.println(course); //null
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.displayDetails();
    }
}

//Java automatically assigns default values to instance variables when they are not explicitly initialized and no constructor is declared.
