package StudentApp;

import java.util.Scanner;

public class StudentApp {

    public static void main() {
        System.out.print("Enter number of new students: ");
        Scanner in = new Scanner(System.in);
        int numOfStudents = in.nextInt();
        Student[] students = new Student[numOfStudents];
        for (int n =0; n < numOfStudents; n++ ) {
            
            students[n] = new Student();
            students[n].enroll();
            students[n].payTuition();
            System.out.println(students[n].toString());
        }
    }
}