/*
Design a class Time with hours (int) and minutes (int) as data
members. Include method setTime(int h, int m) to initialize the time
and displayTime() to display the time. Implement a method
addTime(Time t1, Time t2) that takes two Time objects as arguments,
adds their hours and minutes, and stores the result in the calling
object. Do not use constructors for initialization in this specific
practical.*/

class Time1 {
    private int hours;
    private int minutes;

    public void setTime(int h, int m) {
        this.hours = h;
        this.minutes = m;
    }

    public void displayTime() {
        System.out.println("Time: " + hours + " hours and " + minutes + " minutes");
    }

    public void addTime(Time1 t1, Time1 t2) {
        int totalMinutes = t1.minutes + t2.minutes;
        int totalHours = t1.hours + t2.hours + totalMinutes / 60;
        totalMinutes = totalMinutes % 60;

        this.hours = totalHours;
        this.minutes = totalMinutes;
    }
}

public class Time {
    public static void main(String[] args) {
        Time1 time1 = new Time1();
        Time1 time2 = new Time1();
        Time1 resultTime = new Time1();

        time1.setTime(2, 45);
        time2.setTime(1, 30);

        System.out.println("Time 1:");
        time1.displayTime();

        System.out.println("Time 2:");
        time2.displayTime();

        resultTime.addTime(time1, time2);
        System.out.println("Result of adding Time 1 and Time 2:");
        resultTime.displayTime();
    }
}