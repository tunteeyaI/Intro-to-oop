// Create a class
class Student {

    // Class variables
    String name;
    int age;
    String subject;
    double score;

    // Create a constructor
    Student(String name, int age, String subject, double score) {
        this.name = name;
        this.age = age;
        this.subject = subject;
        this.score = score;
    }

    // Class method to display student information
    void display() {
        System.out.println("--- Student Report ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Subject: " + subject);
        System.out.println("Score: " + score);
    }

    // Method to calculate the student's percentage
    double calculateScore() {
        return score;
    }

    // Method to display student's performance
    void performance() {
        if (score >= 80) {
            System.out.println(name + " performed excellently in " + subject);
        } else if (score >= 60) {
            System.out.println(name + " performed well in " + subject);
        } else if (score >= 50) {
            System.out.println(name + " passed " + subject);
        } else {
            System.out.println(name + " failed " + subject);
        }
    }
}

// Main class
public class Main2 {

    // Main method
    public static void main(String[] args) {

        // Create a student object
        Student student1 = new Student("Grace Abrams", 12, "Mathematics", 85);

        // Execute class methods
        student1.display();
        student1.performance();

        double studentScore = student1.calculateScore();

        System.out.println("Final Score for " + student1.name + ": " + studentScore);
    }
}