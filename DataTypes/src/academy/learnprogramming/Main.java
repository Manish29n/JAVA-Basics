package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        int myValue=10000;

        int myMinIntValue=Integer.MIN_VALUE;
        int myMaxIntValue=Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = "+myMinIntValue);
        System.out.println("Integer Maximum Value = "+myMaxIntValue);
        System.out.println("Busted Maximum Value = "+(myMaxIntValue+1));
        System.out.println("Busted Minimum Value = "+(myMinIntValue-1));

        int Maxterm=2_147_483_647;

        byte myMinByteValue=Byte.MIN_VALUE;
        byte myMaxByteValue=Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = "+myMinByteValue);
        System.out.println("Byte Maximum Value = "+myMaxByteValue);

        short myMinShortValue=Short.MIN_VALUE;
        short myMaxShortValue=Short.MAX_VALUE;
        System.out.println("Short Minimum Value = "+myMinShortValue);
        System.out.println("Short Maximum Value = "+myMaxShortValue);
        
        
        long myLongValue=100L;
        long myMinLongValue=Long.MIN_VALUE;
        long myMaxLongValue=Long.MAX_VALUE;
        System.out.println("Long Minimum Value = "+myMinLongValue);
        System.out.println("Long Maximum Value = "+myMaxLongValue);
        long BigLongValue= 2147483647284L;
        System.out.println("Big Long Value is "+BigLongValue);


        short BigShortValue=32767;

        int myTotal=(myMinIntValue/2);

        byte myByteValue=(byte)(myMinByteValue/2);

        short myShortValue=(short)(myMinShortValue/2);
    }
}
