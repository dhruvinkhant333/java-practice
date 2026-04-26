/*
3.3

Write a Java program to model a college admission system using the
concept of inner classes. Create an outer class named College that
stores the collegeName as a data member and initializes it through a
constructor. Within the College class, define a non-static inner class
named Admission that contains student-specific details such as the
studentName and the course they are enrolling in. The inner class
should have methods to accept and display student information, and it
should also be able to access and display the collegeName stored in
the outer class. In the main method, create an object of the College
class by passing the
collegeName, and then use this object to create an instance of the inner
Admission class. Invoke appropriate methods to input the student's
name and course, and then display the complete admission details,
including the college name.
*/

import java.util.Scanner;

public class Model_of_collage_adm {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter college name: ");
            String collegeName = scanner.nextLine();

            College college = new College(collegeName);

            System.out.print("Enter student name: ");
            String studentName = scanner.nextLine();

            System.out.print("Enter course: ");
            String course = scanner.nextLine();

            College.Admission admission = college.new Admission(studentName, course);
            admission.displayInfo();
        }
    }
}

class College {
    private String collegeName;

    public College(String collegeName) {
        this.collegeName = collegeName;
    }

    class Admission {
        private String studentName;
        private String course;

        public Admission(String studentName, String course) {
            this.studentName = studentName;
            this.course = course;
        }

        public void displayInfo() {
            System.out.println("College: " + collegeName);
            System.out.println("Student: " + studentName);
            System.out.println("Course: " + course);
        }
    }
}
