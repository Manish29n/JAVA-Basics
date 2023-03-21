package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        //Recap of previous Datatypes learned untill now
        //byte
        //int
        //float
        //long
        //short
        //double
        //char
        //boolean
        String myString="This is a String!!";
        System.out.println("My String is equal to "+myString);
        myString=myString+", and this is more.";
        System.out.println("Now my String is equal to "+myString);
        myString=myString+" \u00A9 2021";
        System.out.println("Now my String is equal to "+myString);


        String numberString="250.55";
        numberString=numberString+"49.95";
        System.out.println(numberString);
        String lastString="10";
        int myInt=50;
        lastString=lastString+myInt;
        System.out.println("Last String is equal to "+lastString);
        double doubleNumber=120.47;
        lastString=lastString+doubleNumber;
        System.out.println("Last String is equal to "+lastString);
        
    }
}
