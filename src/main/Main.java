package main;

import TestingClasses01.*;
import TestingClasses02.*;

public class Main {
    public static void main(String[] args){
        System.out.println("Program started ! \n");
        testingClasses01(); //start the method "testingClasses01 without an instance of the "Main" class
        testingClasses02();
        System.out.printf("%nEnd of the program ! %n");

    }

    private static void testingClasses01(){
        FreshJuice juice1 = new FreshJuice();
        juice1.setJuiceSize(FreshJuice.FreshJuiceSize.big);
        System.out.printf("Juice size: %s%n", juice1.getJuiceSize());

        Person person1 = new Person("Constantin", "Mihai Cristian", 23, "student");
        Person person2 = new Person ();
        Person person3 = new Person ("Popescu", "Ion", 20, "software developer");
        System.out.println(person1.getPerson() +
                            person2.getPerson() +
                            person3.getPerson());
    }

    private static void testingClasses02(){
        System.out.print("Tone: ");
        SingleTone tone1 = SingleTone.getTone();
    }
}
