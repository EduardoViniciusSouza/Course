package br.com.udemy;

public class Employee {
    private Integer id;
    private String name;
    private Double salary;
    private String age;

    public Employee(Integer id, String name, Double salary, String age) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    public Employee(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public double SalaryIncrease (double salaryIncrease) {
        return  this.salary += this.salary * (salaryIncrease / 100);
    }

    public String toString() {
        return "Employee data: " +
                "ID: " + id +
                ", Name: " + name  +
                ", Salary: " + salary +
                ", Age: " + age + "\n";
    }
}
