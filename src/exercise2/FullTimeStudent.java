package exercise2;

public class FullTimeStudent extends Student {
    private final int fee = 2000; //Constant fee

    //constructor
    public FullTimeStudent(String name, boolean status) {

        //super class constructor
        super(name, status);
    }
    @Override
    public double calculateTuition() {

        return this.fee;
    }

    @Override
    public String displayInfo() {

        return String.format("%s: %s%n%s: %s%n%s: %.2f%n", "Student's Name", super.getName(),
                "Full Time Student", super.isStatus(),"Tuition Calculated", calculateTuition());

    }
}