package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        int count = 1;
        /*while (count != 6) {
            System.out.println("Count value is " + count);
            count++;
        }

        for (int i = 6; i < 6; i++) {
            System.out.println("Count value is " + i);
        }

        do {
            System.out.println("Count value is " + count);
            count++;
            if (count > 100) {
                break;
            }
        } while (count != 6);*/

        int number = 4;
        int finishNumber = 20;
        while (number < finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            System.out.println(number + " is an even Number");
            count++;
            if(count>5){
                break;
            }
        }
        System.out.println("Total numbers of even Numbers found is "+count);
    }

    public static boolean isEvenNumber(int n) {
        return (n % 2 == 0);
    }
}
