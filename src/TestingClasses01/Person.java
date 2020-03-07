package TestingClasses01;

public class Person {
    private int personNr;
    private String firstName;
    private String secondName;
    private int age;
    private String occupation;

    private static int personsCounter = 0;

    private static Person anonymous = null;

    public Person() {
        this.firstName = this.secondName =  this.occupation = "none";
        this.age = 0;
        personsCounter++;
        this.personNr = personsCounter;
    }

    public Person(String firstName, String secondName, int age, String occupation){
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.occupation = occupation;
        personsCounter++;
        this.personNr = personsCounter;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getAge() {
        return age;
    }

    public String getOccupation() {
        return occupation;
    }

    public String getPerson(){
        return ("\nPerson " + this.personNr + ": \n" +
                        "_________" + "\n" +
                        "\nFirst name: " + this.firstName +
                        "\nSecond name: " + this.secondName +
                        "\nAge: "+ this.age +
                        "\nOccupation: " + this.occupation + "\n" +
                        "_________" + "\n");
    }
}
