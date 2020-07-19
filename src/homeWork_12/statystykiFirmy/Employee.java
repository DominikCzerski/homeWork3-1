package homeWork_12.statystykiFirmy;

public class Employee {

    private String name;
    private String surname;
    private String pesel;
    private String department;
    private double salary;


    public Employee(String name, String surname, String pesel, String department, double salary) {
        this.name = name;
        this.surname = surname;
        this.pesel = pesel;
        this.department = department;
        this.salary = salary;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPesel() {
        return pesel;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return name + ";" + surname + ";" + pesel + ";" + department + ";" + salary;
    }


}
