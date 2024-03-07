package Employee;

import java.util.Scanner;

public class Employee {
    private int employeeId;
    private String employeeName;
    private int age;
    private String gen;
    private double rate;
    private double salary;

    public Employee() {
    }

    public Employee(int employeeId, String employeeName, int age, String gen, double rate) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.age = age;
        this.gen = gen;
        this.rate = rate;
        this.salary = calSalary();
    }

    public void inputData(Scanner scanner){
        System.out.print("Enter employee id: ");
        this.employeeId = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter employee name: ");
        this.employeeName = scanner.nextLine();
        System.out.print("Enter employee age: ");
        this.age = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter employee gender: ");
        this.gen = scanner.nextLine();
        System.out.print("Enter employee rate: ");
        this.rate = Double.parseDouble(scanner.nextLine());
        this.salary = Double.parseDouble(scanner.nextLine());
    }

    public void displayData() {
        System.out.println("Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", age=" + age +
                ", gen='" + gen + '\'' +
                ", rate=" + rate +
                ", salary=" + salary +
                '}');
    }

    public double calSalary() {
        return this.rate * 1300000;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGen() {
        return gen;
    }

    public void setGen(String gen) {
        this.gen = gen;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

