package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Mani", 500);
        System.out.println("New Score is " + newScore);
        calculateScore(75);
        calculateScore();
        double result = calcFeetAndInchesToCentimeters(5, 7);
        System.out.println(result);
        result=calcFeetAndInchesToCentimeters(67);
        System.out.println(result);
    }

    public static int calculateScore(String Playername, int score) {
        System.out.println("Player " + Playername + " scored " + score + " points!");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed Player scored " + score + " points!");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No Player Name, No Player Score");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet >= 0 && inches >= 0 && inches <= 12) {
            double centimeter = (feet * 12 + inches) * 2.54;//because one inch = 2.54 cm and 1 foot = 12 inches.
            return centimeter;
        } else {
            System.out.println("Invalid Feet or Inches Parameter!!");
            return -1;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches >= 0) {
            int feet = (int) inches / 12;
            double remInches = inches % 12;
            System.out.println(inches + " is equal to " + feet + " feet and " + remInches + " inches.");
            return calcFeetAndInchesToCentimeters((double)feet,remInches);
        } else {
            System.out.println("Invalid Feet or Inches Parameter!!");
            return -1;
        }
    }
}
