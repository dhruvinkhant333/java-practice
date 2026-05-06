// Interface for Sports marks
interface Sports {
    float sport_wt = 5.0f; // Standard weightage
    void putSport();
}

// Base class
class Student {
    int rollNo;
    void getNo(int n) {
        rollNo = n;
    }
    void putNo() {
        System.out.println("Roll No: " + rollNo);
    }
}

// Intermediate class
class Test extends Student {
    float m1, m2;
    void getMarks(float a, float b) {
        m1 = a;
        m2 = b;
    }
    void putMarks() {
        System.out.println("Marks Obtained: Part1 = " + m1 + ", Part2 = " + m2);
    }
}

// Final class implementing Multiple Inheritance logic
class Results extends Test implements Sports {
    float total;
    
    public void putSport() {
        System.out.println("Sports Weightage: " + sport_wt);
    }

    void display() {
        total = m1 + m2 + sport_wt;
        putNo();
        putMarks();
        putSport();
        System.out.println("Total Score: " + total);
    }
}

public class GTU_Solution {
    public static void main(String[] args) {
        Results student1 = new Results();
        student1.getNo(101);
        student1.getMarks(85.5f, 90.0f);
        student1.display();
    }
}