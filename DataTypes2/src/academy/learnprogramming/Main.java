package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        
        float myMinFloatValue=Float.MIN_VALUE;
        float myMaxFloatValue=Float.MAX_VALUE;
        System.out.println("Float Minimum value = "+myMinFloatValue);
        System.out.println("Float Maximum value = "+myMaxFloatValue);


        double myMinDoubleValue=Double.MIN_VALUE;
        double myMaxDoubleValue=Double.MAX_VALUE;
        System.out.println("Double Minimum value = "+myMinDoubleValue);
        System.out.println("Double Maximum value = "+myMaxDoubleValue);


        int myIntValue=5/3;
        float myFloatValue=5f/3f;
        double myDoubleValue=5.0/3.0;
        System.out.println("MyIntValue = "+myIntValue);
        System.out.println("MyFloatValue = "+myFloatValue);
        System.out.println("MyDoubleValue = "+myDoubleValue);

        double pi=3.1415927;
        double onemore=3_000_000.4_567_890d;
        System.out.println(pi);
        System.out.println(onemore);
    }
}
