package StudentApp;
import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses = null;
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    public static int id = 1001;

    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter student first name: ");
        this.firstName = in.nextLine();

        System.out.println("Enter student last name: ");
        this.lastName = in.nextLine();

        System.out.println("1 - Freshmen\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter student class level: ");
        this.gradeYear = in.nextInt();
        
        setStudentID();

        System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentID);

        id++;
    }

    private void setStudentID() {
        id++;
        this.studentID = gradeYear + "" + id;
    }

    public void enroll() {
        do {
            System.out.print("Enter course to enroll (Q to quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q")) {
            courses = courses + "\n" + course;
            tuitionBalance = tuitionBalance + costOfCourse;
            }
            else { break; }
        } while (1 !=+ 0);
        System.out.println("Enrolled In: " + courses);
        System.out.println("Tuition Balance: " + tuitionBalance);
    }

    public void viewBalance() {
        System.out.println("Your balance is: $" + tuitionBalance);
    }
    
    public void payTuition() {
        viewBalance();
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.print("Thank you for your payment of $" + payment);
        viewBalance();
    }

    public String toString() {
        return "Name:" + firstName + " " + lastName + "\nCourses Enrolled" + courses + "\nBalance: $" + tuitionBalance;
    }
}