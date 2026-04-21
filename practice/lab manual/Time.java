/*
Design a class Time with hours (int) and minutes (int) as data
members. Include method setTime(int h, int m) to initialize the time
and displayTime() to display the time. Implement a method
addTime(Time t1, Time t2) that takes two Time objects as arguments,
adds their hours and minutes, and stores the result in the calling
object. Do not use constructors for initialization in this specific
practical.*/

class Time {
    private int hours;
    private int minutes;

    public void setTime(int h, int m) {
        this.hours = h;
        this.minutes = m;
    }

    public void displayTime() {
        System.out.println("Time: " + hours + " hours and " + minutes + " minutes");
    }

    public void addTime(Time t1, Time t2) {
        int totalMinutes = t1.minutes + t2.minutes;
        int totalHours = t1.hours + t2.hours + totalMinutes / 60;
        totalMinutes = totalMinutes % 60;

        this.hours = totalHours;
        this.minutes = totalMinutes;
    }
}