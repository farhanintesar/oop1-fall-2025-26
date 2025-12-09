package LabTask2Final;

public class Position {
    private String title;
    private double salary;

    public Position(String title, double salary) {
        this.title = title;
        this.salary = salary;
    }

    public String getTitle() {
        return title;
    }

    public double getSalary() {
        return salary;
    }

    public String toString() {
        return title + " (Salary: " + salary + ")";
    }
}

