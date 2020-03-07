package main;

import TestingClasses01.*;

public class Main {
    public static void main(String[] args){
        System.out.println("Program started ! \n");
        testingClasses01(); //start the method "testingClasses01 without an instance of the "Main" class
        System.out.printf("%nEnd of the program ! %n");

    }

    private static void testingClasses01(){
        FreshJuice juice1 = new FreshJuice();
        juice1.setJuiceSize(FreshJuice.FreshJuiceSize.big);
        System.out.printf("Juice size: %s%n", juice1.getJuiceSize());
    }
}
