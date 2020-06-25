package homeWork_6.tablicaPracowników_2;

public class Company {

    private Employee[] employees;

    public Company(Employee[] employees) {
        this.employees = employees;
    }

    public void add(Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                break;
            }
        }
    }

    public Employee get(int index) {
        return employees[index];
    }
}
