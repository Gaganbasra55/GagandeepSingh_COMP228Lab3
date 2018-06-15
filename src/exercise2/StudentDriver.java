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
        Student[] studentArray = new Student[numberOfStudents];
        //Creating an array of size numberOfStudents variable

        for (int i = 0; i < studentArray.length; ) {
            //Looping through array
            try {
                //Try and catch blocks are used for validations
                System.out.println("Enter 1 to create a Full Time Student\n " +
                        "Enter 2 to create a Part Time Student\n");
                        a = myScanner.next(); //Getting value
                int option = Integer.parseInt(a); //parsing value
                System.out.println();


                    if (option == 1) {
                        FullTimeStudent newStudent = new FullTimeStudent(name, true); //Creating full time student
                        studentArray[i] = newStudent; //Populating array
                        i++;
                    }
                    if (option == 2) {

                    try {

                        System.out.println("Enter student's credit hours\n");
                        a = myScanner.next(); //Getting value
                        int creditHours = Integer.parseInt(a);

