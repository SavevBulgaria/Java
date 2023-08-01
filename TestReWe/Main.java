package TestReWe;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Create below majorProgramCourses collection
        Course one = new Course(19412,"Math",26);
        Course two = new Course(19413,"Math",26);
        Course tree = new Course(19414,"Math",26);
        Course four = new Course(19415,"Math",26);
        Course five = new Course(19416,"Math",26);

        ArrayList<Course> myList= new ArrayList<>();
        myList.addAll(Arrays.asList(one,two,tree,four,five));

    }
}
