package homeWork_5.rokPrzestępny;

public class YearCheck {

    boolean isLeap(int year) {
        return (year % 4 == 0 && year % 100 > 0) || year % 400 == 0;
    }
}
