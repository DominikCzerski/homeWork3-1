package homeWork_6.quizMatematyczny;

public class MathQuizTest {

    public static void main(String[] args) {
        MathQuiz mathQuiz = new MathQuiz();

        boolean answer1 = mathQuiz.question1();
        boolean answer2 = mathQuiz.question2();
        boolean answer3 = mathQuiz.question3();

        boolean[] answers = {answer1, answer2, answer3};

        System.out.println("User answer 1 is " + answer1);
        System.out.println("User answer 2 is " + answer2);
        System.out.println("User answer 3 is " + answer3);
        mathQuiz.calculateScore(answers);
    }
}
