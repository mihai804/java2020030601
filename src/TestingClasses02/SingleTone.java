package TestingClasses02;

public class SingleTone {
    private static SingleTone tone = null;

    private SingleTone(){

    }

    public static SingleTone getTone(){
        if( tone == null)
            tone = new SingleTone();
        System.out.println("E4");
        return tone;
    }
}
