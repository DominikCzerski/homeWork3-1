package homeWork_6.tablicaPracowników_2;

public class CompanyTest {

    public static void main(String[] args) {

        Employee[] employee = new Employee[2];
        employee[0] = new Employee();

        Company company = new Company(employee);
        company.add(employee[0]);
        employee[0].setName("Dominik");

        //Checking if company.get() method returns proper employee reference
        Employee employee1 = company.get(0);
        System.out.println(employee1.getName());
    }
}
