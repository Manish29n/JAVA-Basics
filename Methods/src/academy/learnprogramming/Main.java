package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 4000;
        int levelcompleted = 5;
        int bonus = 100;
        int highScore= calculateScore(gameOver, score, levelcompleted, bonus);
        System.out.println("Your final Score was "+highScore);

        gameOver = true;
        score = 10000;
        levelcompleted = 8;
        bonus = 200;
        highScore= calculateScore(gameOver, score, levelcompleted, bonus);
        System.out.println("Your final Score was "+highScore);

        int finalPosition=calculateHighScorePosition(1500);
        displayHighScorePosition("Manish N",finalPosition);

        finalPosition=calculateHighScorePosition(900);
        displayHighScorePosition("Dishal D",finalPosition);

        finalPosition=calculateHighScorePosition(400);
        displayHighScorePosition("Manvith N",finalPosition);

        finalPosition=calculateHighScorePosition(50);
        displayHighScorePosition("Nihal M",finalPosition);

        finalPosition=calculateHighScorePosition(1000);
        displayHighScorePosition("Rashmitha A",finalPosition);

        finalPosition=calculateHighScorePosition(500);
        displayHighScorePosition("Akarsh A",finalPosition);

        finalPosition=calculateHighScorePosition(100);
        displayHighScorePosition("Darsh D",finalPosition);

        finalPosition=calculateHighScorePosition(2000);
        displayHighScorePosition("Myself",finalPosition);
    }

    public static int calculateScore(boolean gameOver, int score, int levelcompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelcompleted * bonus);
            finalScore += 1000;
            return finalScore;
        }

        return -1;

    }

    public static void displayHighScorePosition(String playerName,int position){
        System.out.println(playerName+" managed to get into position "+position+" on the high score table.");
    }
    public static int calculateHighScorePosition(int playerScore){
//        if(playerScore>=1000){
//            return 1;
//        }
//        else if(playerScore>=500){
//            return 2;
//        }
//        else if(playerScore>=100){
//            return 3;
//        }
//        else{
//            return 4;
//        }
        int position=4;
        if(playerScore>=1000){
            position=1;
        }
        else if(playerScore>=500){
            position=2;
        }
        else if(playerScore>=100){
            position=3;
        }
        return position;
    }
}
