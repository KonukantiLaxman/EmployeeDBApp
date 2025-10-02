package model;

public class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;

    // Constructor for inserting new employee
    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    // Constructor with ID (for update/display)
    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    // Getters and setters
    public int getId() { return id; }
    public String getName() { return name; }
    public String getDepartment() { return department; }
    public double getSalary() { return salary; }

    @Override
    public String toString() {
        return "Employee [ID=" + id + ", Name=" + name + ", Dept=" + department + ", Salary=" + salary + "]";
    }
}
