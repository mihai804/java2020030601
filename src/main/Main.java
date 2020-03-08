package main;

import TestingClasses01.*;
import TestingClasses02.*;

import javax.xml.namespace.QName;

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
        System.out.println("\n\n");
        Employee empOne = new Employee("James Smith");
        Employee empTwo = new Employee("Mary Anne");

        empOne.empAge(26);
        empOne.empDesignation("Senior Software Developer");
        empOne.empSalary(1000);
        empOne.printEmployee();

        empTwo.empAge(21);
        empTwo.empDesignation("Software Developer");
        empTwo.empSalary(500);
        empTwo.printEmployee();


    }
}
