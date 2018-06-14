package exercise2;

public abstract class Student {

    //student name
    private final String name;

    //full time part time status
    private boolean status;

    //Constructor
    public Student(String name, boolean status) {
        this.name = name;
        this.status = status;
    }

    //Getter methods
    public String getName() {
        return name;
    }

    public boolean isStatus() {
        return status;
    }


    //Abstract methods
    public abstract double calculateTuition();
}
