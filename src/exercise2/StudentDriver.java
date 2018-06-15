package exercise2;

import java.util.Scanner;

public class StudentDriver {
    public static void main(String[] args) {

        int numberOfStudents = 0; //no. of students will be processed
        String a = ""; //Variable that will help in validations
        Scanner myScanner = new Scanner(System.in); //object for inputs

        while (numberOfStudents < 1) {
            //execute until number of students is at least 1

            try {

                System.out.println("Enter the number of students you want to create:\n");
                a = myScanner.next();
                //Getting value
                numberOfStudents = Integer.parseInt(a);

                if (numberOfStudents < 1) //Validation if number of students is lesser than 1
                    System.out.println("You must create at least 1 student!\n");

            } catch (Exception e) {
                System.out.println("Enter a valid number!\n");
            }
        }


}
