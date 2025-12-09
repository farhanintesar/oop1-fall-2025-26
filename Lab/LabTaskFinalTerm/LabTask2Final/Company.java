package LabTask2Final;

public class Company {
    private String companyName;
    private Employee[] employees;
    private int count = 0;

    public Company(String companyName, int numberOfEmployees) {
        this.companyName = companyName;
        this.employees = new Employee[numberOfEmployees];
    }

    public void addEmployee(Employee employee) {
        if (count < employees.length) {
            employees[count] = employee;
            count++;
        } else {
            System.out.println("Cannot add more Employees to " + companyName);
        }
    }

    public void showEmployees() {
        System.out.println("Company: " + companyName);
        System.out.println("----------------------------------");
        System.out.println("Employees:");
        for (int i = 0; i < count; i++) {
            System.out.println(" - " + employees[i].getName() +
                    " | " + employees[i].getPosition().getTitle() +
                    " | Salary: " + employees[i].getPosition().getSalary() + "Tk");
        }
    }
}
