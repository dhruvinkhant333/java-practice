/*3.1

Create a Java class named University with a static data member
totalStudents to keep track of the number of student objects created.
Implement a static method getTotalStudents(). Also, include a static 
block to initialize a static variable (e.g., universityName) and an
instance block to print a message when an object is created.
Demonstrate their
heir execution order. {
    
}
*/
class University {
    static int totalStudents;
    static String universityName;

    static {
        universityName = "ABC University";
        System.out.println("Static block executed. University Name: " + universityName);
    }

    {
        System.out.println("Instance block executed. A new student object is being created.");
    }

    public University() {
        totalStudents++;
    }

    public static int getTotalStudents() {
        return totalStudents;
    }
}

public class Uni_student_data {
    public static void main(String[] args) {
        System.out.println("Total Students: " + University.getTotalStudents());

        new University();
        new University();
        new University();

        System.out.println("Total Students after creating 3 student objects: " + University.getTotalStudents());
    }
}