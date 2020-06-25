package homeWork_6.quizMatematyczny;

import java.util.Scanner;

public class MathQuiz {

    private Scanner scanner;

    public MathQuiz() {
        scanner = new Scanner(System.in);
    }

    public boolean question1() {
        System.out.println("What is the result of 3*5");
        int answer = scanner.nextInt();
        int correctAnswer = 3 * 5;
        return correctAnswer == answer;

    }

    public boolean question2() {
        System.out.println("What is the area of square with a side of 12");
        int answer = scanner.nextInt();
        int correctAnswer = 12 * 12;
        return answer == correctAnswer;
    }

    public boolean question3() {
        System.out.println("What is the square root of 15129");
        int answer = scanner.nextInt();
        int correctAnswer = (int) Math.sqrt(15129);
        return answer == correctAnswer;
    }

    public void calculateScore(boolean[] values) {
        int count = 0;
        for (Boolean value : values) {
            if (value) {
                count ++;
            }
        }
        if (count==0 ) {
            System.out.println("User scored 0/3" );
        } else if (count == 1) {
            System.out.println("User scored 1/3" );
        } else if (count == 2) {
            System.out.println("User scored 2/3" );
        } else if (count == 3) {
            System.out.println("User scored 3/3" );
        }
    }
}
