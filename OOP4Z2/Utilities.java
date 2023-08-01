package OOP4Z2;

import CLASSWORKHOMEWORK4.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Utilities {
    static ArrayList<Students> myStudentsList = new ArrayList<Students>();

    public static void inputStudentsData() {
        Scanner scanner = new Scanner(System.in);
        Students myStudent01 = new Students("Krasimir", "Iliev", 1999);
        Students myStudent02 = new Students("Denis", "Savev", 19412);
        Students myStudent03 = new Students("Alexander", "Belchev", 19402);
        Students myStudent04 = new Students("Eli", "Stavreva", 19414);
        Students myStudent05 = new Students("Boyan", "Fotev", 19405);

        myStudentsList.add(myStudent01);
        myStudentsList.add(myStudent02);
        myStudentsList.add(myStudent03);
        myStudentsList.add(myStudent04);
        myStudentsList.add(myStudent05);


        //assign students scores ::
        for (Students tempStudent : myStudentsList) {
            System.out.println("Input scores for " + tempStudent.number);
            System.out.println("Input MATH : ");
            tempStudent.thisStudentScores.math = scanner.nextDouble();

            System.out.println("Input Physics : ");
            tempStudent.thisStudentScores.phys = scanner.nextDouble();

            System.out.println("Input Programming : ");
            tempStudent.thisStudentScores.prog = scanner.nextDouble();
        }
    }

    public static void printStudentsData() {
        for (Students tempStudent : myStudentsList) {
            tempStudent.Printinfo();
        }


    }
}
