package homeWork_12.statystykiFirmy;

public class CompanyTest {

    public static void main(String[] args) {
        Company company = new Company();

        for (Employee employee1 : company.getEmployees()) {
            System.out.println(employee1);
        }

        System.out.println("Srednia wypłata: " + company.averageSalary());
        System.out.println("Najmniejsza wypłata: " + company.lowestSalary());
        System.out.println("Najwieksza wypłata: " + company.highestSalary());
        System.out.println("Liczba pracowników w dziale IT: " + company.whichDepartment("it"));
        System.out.println("Liczba pracowników w dziale Management: " + company.whichDepartment("management"));
        System.out.println("Liczba pracowników w dziale Support: " + company.whichDepartment("support"));

        FileModify.saveStatistics(Company.companyStatisticsFileName, company);


    }
}
