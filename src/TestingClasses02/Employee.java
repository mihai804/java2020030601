package TestingClasses02;

public class Employee {
    private String name;
    private int age;
    private String designation;
    private double salary;

    public Employee(String name){
        this.name = name;
    }

    public void empAge(int empAage){
        this.age = empAage;
    }

    public void empDesignation(String designation){
        this.designation = designation;
    }

    public void empSalary(double salary){
        this.salary = salary;
    }

    public void printEmployee(){
        System.out.println("Name: "+ this.name);
        System.out.println("Age: "+ this.age);
        System.out.println("Designation: "+ this.designation);
        System.out.println("Salary: "+ this.salary);
    }
}
