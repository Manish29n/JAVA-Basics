package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        String numberAsString="2021.125";
        System.out.println("numberAsString= "+numberAsString);

        double number = Double.parseDouble(numberAsString);
        System.out.println("number = "+number);

        numberAsString += 1;
        number++;

        System.out.println("numberAsString= "+numberAsString);
        System.out.println("number = "+number);

    }
}
