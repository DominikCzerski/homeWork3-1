package homeWork_13.sumaLiczbDodatnich;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class NumbersSum {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList();
        Scanner input = new Scanner(System.in);

        boolean isPositive = true;
        while (isPositive){
            System.out.println("Please state your number");
            int number = input.nextInt();
            if (number >= 0 ){
                list.add(number);
            } else {
                isPositive = false;
            }

        }

        //Summing the list
        Integer sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }

        //Printing list in a + b + c = x format
        ArrayList<String> numberStringArray = new ArrayList<>();
        for (Integer integer : list){
            numberStringArray.add(integer.toString());
        }

        String result = String.join("+", numberStringArray);
        System.out.println(result + " = " + sum);

        System.out.println("Lowest number of list is " + Collections.min(list));
        System.out.println("Highest number of list is " + Collections.max(list));
        //Reversing list
        Collections.reverse(list);
        System.out.println("Reversed list : " + list);
    }

}
