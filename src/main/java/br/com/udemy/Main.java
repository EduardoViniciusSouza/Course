package br.com.udemy;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> employee = new ArrayList<>();

        System.out.println("How many employees will be registered? ");
        int employeesQuantity = sc.nextInt();
        for (int i = 0; i < employeesQuantity; i++) {
            System.out.println("Employee #" + (i + 1));
            employee.add(RegisterEmployee());
        }
        System.out.println(" ");
        System.out.println(employee);

        System.out.println("Enter the employee id that will have salary increase: ");
        int idSalary = sc.nextInt();
        Integer position = Position(employee, idSalary);

        if (position == null) {
            System.out.println("This ID does not exist!");
        } else {
            System.out.println("Enter the percentage: ");
            double percent = sc.nextDouble();
            employee.get(position).SalaryIncrease(percent);
        }
        System.out.println(" ");
        System.out.println(employee);

    }
    public  static Employee RegisterEmployee() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Employee ID: ");
        Integer id = sc.nextInt();

        sc.nextLine();

        System.out.println("Employee name: ");
        String name = sc.nextLine();

        System.out.println("Employee salary: ");
        Double salary = sc.nextDouble();

        System.out.println("Testing git :)");

        Employee employee = new Employee(id, name, salary);

        return employee;
    }
    public static Integer Position(ArrayList<Employee> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }
}
