package homeWork_5.rokPrzestępny;

public class YearCheckTest {

    public static void main(String[] args) {
        YearCheck yearCheck = new YearCheck();
        System.out.println(yearCheck.isLeap(2012));
        System.out.println(yearCheck.isLeap(2100));
        System.out.println(yearCheck.isLeap(2016));
        System.out.println(yearCheck.isLeap(2024));
        System.out.println(yearCheck.isLeap(2096));
        System.out.println(yearCheck.isLeap(3201));
        System.out.println(yearCheck.isLeap(2017));
    }
}
