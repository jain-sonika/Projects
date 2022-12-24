package studentdatabaseapp;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int  gradeYear;
    private String studentID;
    private String courses = null;
    private int tutionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1000;

    // Constructor: prompt user to entre student's name and year
    public Student(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter student first name: ");
        this.firstName = in.nextLine();

        System.out.print("Enter student last name: ");
        this.lastName = in.nextLine();

        System.out.print("Enter student class level: ");
        this.gradeYear = in.nextInt();

        setStudentID();


        id++;
    }
    // Generate an ID
    private void setStudentID(){
        // Grade Level + ID
        id++;
        this.studentID = gradeYear + "" + id;

    }

    // Enroll in courses
    public void enroll() {
        // Get inside the loop , user hits 0
        do {
            System.out.print("Enter course to enroll (0 to quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q")) {

                courses = courses + "\n  " + course;
                tutionBalance = tutionBalance + costOfCourse;
            }
            else {

                break;
            }
        } while (1 !=0);


    }

    // View balance
    public void viewBalance(){
        System.out.println("Your balance is: $" + tutionBalance);
    }

    // Pay Tuition
    public void payTuition(){
        viewBalance();
        System.out.print("Enter your payment: $");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();

        tutionBalance = tutionBalance - payment;
        System.out.println("Thank you for your payment of $" + payment);
        viewBalance();

    }

    // Show status
    public String toString(){
        return "Name: " + firstName + " " + lastName +
                "\nGrade Level: " + gradeYear +
                "\nstudent ID: " + studentID +
                "\nCourses Enrolled:" + courses +
                "\nBalance: $" + tutionBalance;
    }

}
