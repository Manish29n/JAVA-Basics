package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 4000;
        int levelcompleted = 5;
        int bonus = 100;
        if (gameOver) {
            int finalScore = score + (levelcompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

        if (gameOver) {
            score = 10000;
            levelcompleted = 8;
            bonus = 200;
            int secondfinalScore = (score + (levelcompleted * bonus));
            System.out.println("Your second Final score was " + secondfinalScore);
        }
    }
}
