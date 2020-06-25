package homeWork_6.tablicaPracowników_1;

import java.util.Scanner;

public class EmployeeTest {

    public static void main(String[] args) {
        Employee[] employee = new Employee[2];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please state employees names:");
        employee[0] = new Employee();
        employee[0].setName(scanner.nextLine());
        employee[1] = new Employee();
        employee[1].setName(scanner.nextLine());
        System.out.println("Please state " + employee[0].getName() + " surname:");
        employee[0].setSurname(scanner.nextLine());
        System.out.println("Please state " + employee[1].getName() + " surname:");
        employee[1].setSurname(scanner.nextLine());
        System.out.println("Please state " + employee[0].getName() + " salary:");
        employee[0].setSalary(scanner.nextDouble());
        System.out.println("Please state " + employee[1].getName() + " salary:");
        employee[1].setSalary(scanner.nextDouble());

        String formattedSalary = String.format("%.02f", employee[0].getSalary() + employee[1].getSalary());
        System.out.println("The company has to pay " + formattedSalary + " in salaries");
        scanner.close();
    }
}
