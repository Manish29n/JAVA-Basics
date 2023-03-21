package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        System.out.println("10000 at 2% interest is " + calculateInterest(10000, 2));
        System.out.println("10000 at 3% interest is " + calculateInterest(10000, 3));
        System.out.println("10000 at 4% interest is " + calculateInterest(10000, 4));
        System.out.println("10000 at 5% interest is " + calculateInterest(10000, 5));
//       for statement syntax for(init;termination;increment);
        for (int i = 0; i < 5; i++) {
            System.out.println("Loop " + i + " hello!");
        }

        for (int i = 2; i < 9; i++)
            System.out.println("10000 at " + i + "% interest is " + String.format("%.2f", calculateInterest(10000, (double) i)));
        System.out.println("Reverse!!");
        for (int i = 8; i > 1; i--) {
            System.out.println("10000 at " + i + "% interest is " + String.format("%.2f", calculateInterest(10000, (double) i)));
        }

        for (int i = 1, count = 0; i < 100; i++) {
            if (isPrime(i)) {
                count++;
                System.out.println("Number " + i + "is a Prime Number!");
                if (count == 3) {
                    System.out.println("Exiting Loop");
                    break;
                }
            }
        }

        for (int i = 1, count = 0; i < 100; i++) {
            if (isPrime(i)) {
                count++;
                System.out.println("Number " + i + "is a Prime Number!");
            }
            if (i==99) {
                System.out.println("Total Prime Numbers are "+count);
            }
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= (long) Math.sqrt(n); i++) {
//            i <= n / 2; can also be used in termination!!
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
