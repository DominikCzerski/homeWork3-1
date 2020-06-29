package homeWork_7.odwróconePowitania;

import java.util.Scanner;

public class Names {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String [] names = new String[5];

        for (int i = 0; i < 5; i++){
            System.out.println("State your name");
            names[i] = input.next();
        }

        for (int i = names.length; i > 0; i--) {
            System.out.println("Cześć " + names[i - 1]);
        }

    }
}
