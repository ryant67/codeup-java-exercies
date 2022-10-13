package grades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

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
        students.put("Jane321", student2);
        students.put("Lucyloohoo", student3);

        //GitHub username creator
        ArrayList<String> names = new ArrayList<>();
        for(String keys : students.keySet()) {
            names.add("|" + keys + "|");
        }
        System.out.println(names);

        String newName = "";
        for(int i = 0; i < names.size(); i++) {
            newName += names.get(i) + " ";
        }
        System.out.println(newName);

//        String newName = "";
//        String nameFormat = "";
//        for(int i = 0; i < names.size(); i++) {
//            newName += names.get(i) + " ";
//            nameFormat += "|" + names.get(i) + "| ";
//        }
//        System.out.println(newName);

        //Command Line Interface
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Hello!");
//        System.out.println("");
//        System.out.println("Here are the GitHub usernames for our students: ");
//        System.out.println("");
//        System.out.println(nameFormat);
//        System.out.println("");
//        System.out.println("Which student would you like to see more information on?");
//        String userInput = scan.nextLine();
//        System.out.println(userInput);
//
//        if(userInput.equalsIgnoreCase(newName)) {
//            System.out.println("Name: " + student0.getName() + " - GitHub UserName: " + names + "%nCurrent Average: " + student0.getGradeAverage());
//        } else {
//            System.out.println("Sorry, no student was found with the GitHub username of " + "\"" + userInput + "\"");
//        }


    }

}
