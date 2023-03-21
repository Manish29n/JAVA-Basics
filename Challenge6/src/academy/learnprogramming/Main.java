package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1, count = 1; i <= 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " is divisible by both 3 and 5.");
                count++;
                sum += i;
                if (count > 5) {
                    System.out.println("Exiting Loop!!");
                    break;
                }
            }
        }
        System.out.println("The sum of the above 5 numbers is " + sum);
    }
}
