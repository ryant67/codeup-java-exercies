package grades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {

    public static void main(String[] args) {

        HashMap<String, Student> students = new HashMap<>();
        //new Student Instances
        Student george = new Student("George");
        george.addGrade(90);
        george.addGrade(80);
        george.addGrade(70);
        students.put("george1", george);

        Student joey = new Student("Joey");
        joey.addGrade(95);
        joey.addGrade(85);
        joey.addGrade(75);
        students.put("joey2", joey);

        Student jane = new Student("Jane");
        jane.addGrade(99);
        jane.addGrade(89);
        jane.addGrade(79);
        students.put("jane3", jane);

        Student lucy = new Student("Lucy");
        lucy.addGrade(98);
        lucy.addGrade(88);
        lucy.addGrade(78);
        students.put("lucy4", lucy);

        //GitHub username creator
        ArrayList<String> names = new ArrayList<>();
        for(String keys : students.keySet()) {
            names.add("|" + keys + "|");
        }
//        System.out.println(names);

        String newName = "";
        for(int i = 0; i < names.size(); i++) {
            newName += names.get(i) + " ";
        }
//        System.out.println(newName);

        //Command Line Interface
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello!");
        System.out.println("");
        System.out.println("Here are the GitHub usernames for our students: ");
        System.out.println("");
        System.out.println(newName);
        System.out.println("");
        System.out.println("Which student would you like to see more information on?");
        String userInput = scan.nextLine();
//        System.out.println(userInput);

//        if(userInput.equalsIgnoreCase(newName)) {
//            System.out.println("Name: " + .getName() + " - GitHub UserName: " + names + "Current Average: " + .getGradeAverage());
//        } else {
//            System.out.println("Sorry, no student was found with the GitHub username of " + "\"" + userInput + "\"");
//        }


    }

}
