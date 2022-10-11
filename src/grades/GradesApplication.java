package grades;

import java.util.HashMap;

public class GradesApplication {

    public static void main(String[] args) {

        HashMap<String, Student> students = new HashMap<>();
        //new Student Instances
        Student student0 = new Student("George");
        Student student1 = new Student("Joey");
        Student student2 = new Student("Jane");
        Student student3 = new Student("Lucy");
        //student0 grades
        student0.addGrade(90);
        student0.addGrade(80);
        student0.addGrade(85);
        //student1 grades
        student1.addGrade(95);
        student1.addGrade(100);
        student1.addGrade(89);
        //student2 grades
        student2.addGrade(95);
        student2.addGrade(100);
        student2.addGrade(89);
        //student3 grades
        student3.addGrade(95);
        student3.addGrade(100);
        student3.addGrade(89);
        //Adding students to HashMap
        students.put("GeorgyIT", student0);
        students.put("Joey123", student1);
        students.put("JaneJ4", student2);
        students.put("Lucy897", student3);

//        System.out.println(students);

        for(String keys : students.keySet()) {
            System.out.println(keys);
        }

        //Command Line Interface
//        System.out.println("Hello!");
//        System.out.println("");
//        System.out.println("Here are the GitHub usernames for our students: ");
//        System.out.println("");
//        System.out.printf("|%s| |%s| |%s| |%s|",);
//        System.out.println("");


    }

}
