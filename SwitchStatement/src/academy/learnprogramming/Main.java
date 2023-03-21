package academy.learnprogramming;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        /*int value = 3;
        if (value == 1) {
            System.out.println("value was 1");
        } else if (value == 2) {
            System.out.println("value was 2");
        } else {
            System.out.println("value was not 1 or 2");
        }*/
        int SwitchValue = 1;

        switch (SwitchValue) {
            case 1:
                System.out.println("value was 1");
                break;
            case 2:
                System.out.println("value was 2");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("value was 3 or 4 or 5");
                System.out.println("Actually it was " + SwitchValue);
                break;
            default:
                System.out.println("value was not 1,2,3,4 or 5");
        }
//        Challenge
        char SwitchChar = 'D';
        switch (SwitchChar) {
            case 'A':
                System.out.println("It is A");
                break;
            case 'B':
                System.out.println("It is B");
                break;
            case 'C':
            case 'D':
            case 'E':
                System.out.println("It is "+SwitchChar);
                break;
            default:
                System.out.println("Not Found");
        }

        String Month="january";
        switch(Month.toLowerCase()){
            case "january":
                System.out.println("Jan");
                break;
            case "october":
                System.out.println("Oct");
                break;
            default:
                System.out.println("Not sure");
        }
    }
}
