package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter your year of birth :");
        boolean hasNextInt=scanner.hasNextInt();

        if(hasNextInt){
            int yearBirth = scanner.nextInt();
            scanner.nextLine();  // handle next line character (enter key)

            System.out.println("Enter your name :");
            String name = scanner.nextLine();

            int age = 2021 - yearBirth;
            if(age<=100&&age>=0){
                System.out.println("Your name is " + name + " and you are " + age + " years old.");
            }else{
                System.out.println("Error !! enter a valid Year");
            }
        }else{
            System.out.println("Error!! Enter only integers..");
        }

        scanner.close();

    }
}
