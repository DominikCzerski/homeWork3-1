package homeWork_12.statystykiFirmy;

public class Company {

    private Employee[] employees;

    public Company() {
        this.employees = FileModify.read(companyInfoFileName);

    }

    private static final String companyInfoFileName = "src/homeWork_12/statystykiFirmy/employeesInfo.csv";
    public static final String companyStatisticsFileName = "src/homeWork_12/statystykiFirmy/employeesStatistics.txt";

    public Employee[] getEmployees() {
        return employees;
    }

    double averageSalary() {
        int companySize = FileModify.numberOfLines(companyInfoFileName);
        double summedSalary = 0;
        for (Employee employee : employees) {
            summedSalary += employee.getSalary();
        }
        return summedSalary / companySize;
    }

    double lowestSalary() {
        double lowestSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            lowestSalary = Math.min(lowestSalary, employee.getSalary());
        }
        return lowestSalary;
    }

    double highestSalary() {
        double highestSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            highestSalary = Math.max(highestSalary, employee.getSalary());
        }
        return highestSalary;

    }

    int whichDepartment(String department) {
        int count = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment().equalsIgnoreCase(department)) {
                count++;
            }
        }
        return count;
    }
}

