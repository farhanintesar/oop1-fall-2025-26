package LabTask2Final;

public class Main {
    public static void main(String[] args) {

        Position developer = new Position("Developer", 70000);
        Position manager = new Position("Manager", 60000);
        Position intern = new Position("Developer", 60000);

        Company company = new Company("Thunderclap Software Ltd.", 3);

        company.addEmployee(new Employee("Farhan Intesar", developer));
        company.addEmployee(new Employee("Riyad Hossain", manager));
        company.addEmployee(new Employee("Sazid Hasan Sahil", intern));
        company.showEmployees();

        System.out.println();
        Employee employee = new Employee("Prinon Islam", new Position("Adviser", 50000));
        employee.showEmployeeInfo();
    }
}
