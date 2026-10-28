package firstprogram;


public class StudentsResult {

    
    int calculateTotal(int m1, int m2, int m3, int m4, int m5) {
        return m1 + m2 + m3 + m4 + m5;
    }

    
    double calculateAverage(int total) {
        return total / 5.0;
    }

    
    String calculateGrade(double average) {
        if (average >= 90) {
            return "A";
        } else if (average >= 75) {
            return "B";
        } else if (average >= 50) {
            return "C";
        } else {
            return "Fail";
        }
    }

    
    void displayResult(int total, double average, String grade) {
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);
    }

    public static void main(String[] args) {
        StudentsResult student = new StudentsResult();

        
        int m1 = 85, m2 = 78, m3 = 92, m4 = 88, m5 = 77;

        int total = student.calculateTotal(m1, m2, m3, m4, m5);
        double average = student.calculateAverage(total);
        String grade = student.calculateGrade(average);

        student.displayResult(total, average, grade);
    }
}

